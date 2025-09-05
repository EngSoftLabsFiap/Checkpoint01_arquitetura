package br.com.fiap.winery;

import br.com.fiap.winery.stub.WineStockService;
import br.com.fiap.winery.stub.WineWarningService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {

    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "http://localhost:8085/WineStockService?wsdl";
        final String TARGET = "http://winery.fiap.com.br/";
        final String NAME = "WineStockServiceImplementationService";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("Chardonnay", 10);
        System.out.println(order);

        URL url2 = new URL("http://localhost:8085/WineWarningService?wsdl");
        QName qName2 = new QName("http://winery.fiap.com.br/","WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qName2);

        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String warn = wineWarningService.sendWarn();
        System.out.println(warn);
    }
}

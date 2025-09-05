package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override

    public String getMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu de Vinhos por Uva:\n")
                .append("- Cabernet Sauvignon: Tinto encorpado\n")
                .append("- Merlot: Tinto suave\n")
                .append("- Pinot Noir: Tinto leve\n")
                .append("- Syrah: Tinto especiado\n")
                .append("- Malbec: Tinto frutado\n")
                .append("- Chardonnay: Branco encorpado\n")
                .append("- Sauvignon Blanc: Branco aromático\n")
                .append("- Riesling: Branco floral\n")
                .append("- Rosé: Versátil e refrescante\n")
                .append("- Espumante: Brut / Demi-Sec");
        return sb.toString();
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}

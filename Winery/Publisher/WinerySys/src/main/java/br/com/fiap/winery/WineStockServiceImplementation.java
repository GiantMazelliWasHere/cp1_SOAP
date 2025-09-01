package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        String menuTinto = "Vinho tinto:\nCabernet Sauvignon - Château Lafite Rothschild, Opus One, Concha y Toro Don Melchor;\n" +
                "Merlot - Duckhorn Vineyards, Château Pétrus, Casa Valduga Merlot Premium.\n";

        String menuBranco = "Vinho branco:\nChardonnay - Cloudy Bay, Chablis Grand Cru, Miolo Reserva Chardonnay;\n" +
                "Sauvignon Blanc - Kim Crawford, Sancerre Domaine Vacheron, Villa Maria Private Bin.";

        return menuTinto + menuBranco;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "O pedido de " + quantity + " vinhos, do cliente " + name + ". Foi realizado com sucesso!";
    }
}

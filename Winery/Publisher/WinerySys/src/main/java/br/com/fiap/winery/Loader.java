package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        System.out.println("Publicando API......................................");

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        Endpoint.publish("http://localhost:8085/WineWarningService", wineWarning);

        System.out.println("Serviço Públicado!");

    }
}

package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {
        WineStockServiceImplementation WineStock = new WineStockServiceImplementation();

        System.out.println("Publicando API......................................");

        Endpoint.publish("http://localhost:8085/WineStockService", WineStock);

        System.out.println("API Publicada com sucesso!!!!!!");

    }
}

package br.com.fiap.winery;

import br.com.fiap.winery.stub_classes.WineStockService;
import br.com.fiap.winery.stub_classes.WineWarningService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "http://localhost:8085/WineStockService?wsdl";
        final String TARGET = "http://winery.fiap.com.br/";
        final String NAME = "WineStockServiceImplementationService";

        final String WSDL2 = "http://localhost:8085/WineWarningService?wsdl";
        final String NAME2 = "WineWarningServiceImplementationService";

        URL url = new URL(WSDL);
        QName qname = new QName(TARGET, NAME);
        Service service = Service.create(url, qname);

        URL url2 = new URL(WSDL2);
        QName qname2 = new QName(TARGET, NAME2);
        Service service2 = Service.create(url2, qname2);

        WineStockService wineStockService = service.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("Eduardo", 20);
        System.out.println(order);

        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String warn = wineWarningService.sendWarn();
        System.out.println(warn);
    }
}

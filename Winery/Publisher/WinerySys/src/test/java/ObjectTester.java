import br.com.fiap.winery.WineStockServiceImplementation;

public class ObjectTester {
    public static void main(String[] args) {
        WineStockServiceImplementation wine = new WineStockServiceImplementation();

        System.out.println(wine.getMenu());
        System.out.println(wine.placeOrder("Edu", 14));
    }
}

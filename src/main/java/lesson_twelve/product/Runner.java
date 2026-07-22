package lesson_twelve.product;

public class Runner {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product phoneOne = new Product(123, "Samsung", 1000.1);
        Product phoneTwo = new Product(124, "Iphone", 1300.1);
        Product phoneThree = new Product(125, "Xiaomi", 700.2);

        catalog.addProduct(phoneOne);
        catalog.addProduct(phoneTwo);
        catalog.addProduct(phoneThree);

        System.out.println(catalog.getMostExpensiveProduct());

        catalog.printAllProduct();

        catalog.clearCatalog();

        catalog.printAllProduct();
    }
}

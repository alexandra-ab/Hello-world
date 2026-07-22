package lesson_twelve.product;

import java.util.ArrayList;

public class ProductCatalog {
    private ArrayList<Product> products;

    public ProductCatalog() {
       products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Product removed.");
                return;
            }
        }
        System.out.println(String.format("Product with id %d not found.", id));
    }

    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }
        Product mostExpensive = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public void printAllProduct() {
        if (products.isEmpty()) {
            System.out.println("Catalog is empty.");
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void clearCatalog() {
        products.clear();
    }
}

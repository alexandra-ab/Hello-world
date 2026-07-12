package lesson_nine.product;

public class Product {
    private static int totalProducts = 0;
    private static int totalStock = 0;

    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        totalProducts += stock;
        totalStock += stock;
    }

    public String getInfo() {
        return String.format("Продукт: %s стоит %d евро, на складе %d", name, price, stock);
    }

    public void sellProduct(int quantity) {
        if (stock < quantity) {
            System.out.println("Не достаточно товара на складе.");
        } else {
            stock -= quantity;
            totalStock -= quantity;
            double percentLeft = (double) stock / (stock + quantity)  * 100;
            System.out.println("Остаток на складе: " + percentLeft);
        }
    }

    public static void showStatistics() {
        String show = String.format("Всего было товаров: %d, осалось на складе %d.", totalProducts, totalStock);
        System.out.println(show);
    }

    public static void showAverageStock() {
        if (totalProducts == 0) {
            System.out.println("Средний остаток 0");
        } else {
            double average = (double) totalStock / totalProducts;
            System.out.println("Средний остаток товаров на складе: " + Math.round(average));
        }
    }
}

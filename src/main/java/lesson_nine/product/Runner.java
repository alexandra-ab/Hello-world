package lesson_nine.product;

public class Runner {
    public static void main(String[] args) {
        Product cucumber = new Product("Огурец", 5, 6);
        Product tomato = new Product("Помидор", 2, 10);
        Product bread = new Product("Хлеб", 1, 4);
        System.out.println(cucumber.getInfo());
        System.out.println(tomato.getInfo());
        System.out.println(bread.getInfo());
        tomato.sellProduct(5);
        Product.showAverageStock();
        Product.showStatistics();
    }
}

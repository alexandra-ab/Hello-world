package lesson_six;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name!");
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
           this.price = price;
        } else {
            System.out.println("Ivalid price!");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
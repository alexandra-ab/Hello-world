package lesson_six;

public class Runner {
    public static void main(String[] args) {
        Product productOne = new Product();
        productOne.setPrice(5);
        productOne.setQuantity(5);
        productOne.setName("String");
        System.out.println(productOne);

        User johnDoe = new User("John Doe", "1234abcd", "john.doe@example.com", false);
        User admin123 = new User("Admin123", "admin@123", "admin@example.com", true);
        System.out.println(johnDoe);
        System.out.println(admin123);
        johnDoe.changePassword("fkkddksk", "123456789");
        admin123.setUsername("");
        johnDoe.setEmail("john.d@example.com");
        System.out.println(johnDoe.getEmail());

        MobilePhone iphone = new MobilePhone("Iphone", "12", 80, "Alice", "Bob");
        MobilePhone samsung = new MobilePhone("Samsung", "Galaxy S21", 15, "Tim", "Alan");
        iphone.callContact("Alice");
        iphone.callContact("Tim");
        samsung.callContact("Tim");
        samsung.callContact("Alan");
    }
}


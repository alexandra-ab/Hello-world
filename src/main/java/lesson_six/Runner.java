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
        iphone.setBatteryLevel(123);
        samsung.setContact2("");

        CustomerAccount johnDoeCostomer = new CustomerAccount("John Doe", "john@example.com", 200.0, 10, "Active");
        CustomerAccount marySmith = new CustomerAccount("Mary Smith", "mary@example.com", 50.0, 0, "Blocked");
        johnDoeCostomer.purchase(50.0);
        System.out.println(johnDoeCostomer);
        marySmith.applyDiscount(0);
        marySmith.purchase(30.0);
    }
}


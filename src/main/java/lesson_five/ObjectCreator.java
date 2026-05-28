package lesson_five;

public class ObjectCreator {
    public static void main(String[] args) {
        Person personOne = new Person("Alice", 25);
        Person personTwo = new Person();
        personTwo.name = "Bob";
        personTwo.age = 33;
        personOne.name = "Kate";
        personOne.talk();
        personTwo.talk();

        Cat catOne = new Cat("Barsik", 4, "red");
        Cat catTwo = new Cat("Arni");
        catTwo.age = 1;
        catOne.meow();
        catTwo.meow();

        Dog rex = new Dog("Rex", "German Shepherd", 6, 30);
        Dog bella = new Dog("Bella", "Golden Retriever");
        rex.eat(2.5);
        bella.bark();

        Car tesla = new Car("Tesla", "Model S", 20000, 80);
        Car toyota = new Car("Toyota", "Corolla");
        tesla.drive(300);
        toyota.refuel(10);
        toyota.drive(700);
    }
}

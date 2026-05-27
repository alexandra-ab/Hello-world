package lesson_five;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.age = 1;
        this.weight = 5.0;
    }

    public void bark() {
        for (int i = 0; i <= age; i++) {
            System.out.println(name + " bark!");
        }
    }

    public void eat(double foodWeight) {
        weight += foodWeight / 2;
        System.out.println(name + "'s weight is " + weight);
    }
}

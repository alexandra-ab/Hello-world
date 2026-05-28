package lesson_five;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public void talk() {
        System.out.println("I am " + name + " and I am " + age);
    }
}



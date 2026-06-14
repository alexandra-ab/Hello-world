package lesson_eight.library;

public abstract class Person {
    protected String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void performAction(Book book);
}

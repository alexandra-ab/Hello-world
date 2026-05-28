package lesson_five;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(String name) {
        this.name = name;
        this.color = "gray";
    }

    public void meow() {
        for (int i = 1; i <= age; i++) {
            System.out.println(name + " Meow");
        }
    }
}

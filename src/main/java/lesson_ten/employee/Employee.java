package lesson_ten.employee;

public abstract class Employee {
    protected String name;
    public int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract int calculateSalary();

    public abstract void work();

    public void showInfo() {
        String info = String.format("Имя сотрудника: %s, возраст: %d", name, age);
        System.out.println(info);
    }
}

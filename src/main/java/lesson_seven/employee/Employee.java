package lesson_seven.employee;

public class Employee {
    protected String name;
    protected int age;
    protected double baseSalary;

    public Employee(String name, int age, double baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

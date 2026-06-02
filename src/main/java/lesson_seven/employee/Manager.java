package lesson_seven.employee;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double baseSalary, double bonus) {
        super(name, age, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary += bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                "bonus=" + bonus +
                '}';
    }
}

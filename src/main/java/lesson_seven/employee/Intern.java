package lesson_seven.employee;

public class Intern extends Employee{
    public Intern(String name, int age, double baseSalary) {
        super(name, age, baseSalary);
    }

    @Override
    public double calculateSalary() {
        if (this.baseSalary > 1000) {
            return 1000;
        } else {
            return baseSalary;
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

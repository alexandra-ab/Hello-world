package lesson_ten.employee;

public class OfficeEmployee extends Employee{
    private int salary;

    public OfficeEmployee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return salary;
    }

    @Override
    public void work() {
        String work = String.format("%s работает из офиса и так же может работать удаленно.", name);
        System.out.println(work);
    }
}

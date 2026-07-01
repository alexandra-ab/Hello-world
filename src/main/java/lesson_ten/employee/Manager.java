package lesson_ten.employee;

public class Manager extends Employee implements Trainable{
    private int salary;

    public Manager(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return salary;
    }

    @Override
    public void work() {
        String work = String.format("%s работает из офиса.", name);
        System.out.println(work);
    }

    @Override
    public void attendTraining() {
        String attendTraining = String.format("%s проходит тренинг раз в месяц.", name);
        System.out.println(attendTraining);
    }
}

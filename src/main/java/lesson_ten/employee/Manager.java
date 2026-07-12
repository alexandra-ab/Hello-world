package lesson_ten.employee;

public class Manager extends Employee implements Trainable{
    private int salary;
    private int bonus;

    public Manager(String name, int age, int salary, int bonus) {
        super(name, age);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return salary + this.bonus;
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

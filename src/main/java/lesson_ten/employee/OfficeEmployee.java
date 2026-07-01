package lesson_ten.employee;

public class OfficeEmployee extends Employee implements Trainable{
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

    @Override
    public void attendTraining() {
        String attendTrainig = String.format("%s не проходит тренинг. Офисных сотрудников не тренируют.", name);
        System.out.println(attendTrainig);
    }
}

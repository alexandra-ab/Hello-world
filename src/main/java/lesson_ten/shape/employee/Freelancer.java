package lesson_ten.shape.employee;

public class Freelancer extends Employee implements Trainable{
    private int paymentForProject;
    private int numberOfProjects;

    public Freelancer(String name, int age, int paymentForProject, int numberOfProjects) {
        super(name, age);
        this.paymentForProject = paymentForProject;
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public int calculateSalary() {
        return paymentForProject * numberOfProjects;
    }

    @Override
    public void work() {
        String work = String.format("%s работает удаленно.", name);
        System.out.println(work);
    }

    @Override
    public void attendTraining() {
        String attendTraining = String.format("%s проходит тренинг раз в 6 месяцев.", name);
        System.out.println(attendTraining);
    }
}

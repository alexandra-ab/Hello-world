package lesson_ten.shape.employee;

public class Runner {
    public static void main(String[] args) {
        OfficeEmployee alice = new OfficeEmployee("Алиса", 24, 1000);
        Freelancer roman = new Freelancer("Роман", 35, 200, 5);
        Manager valeria = new Manager("Валерия", 27, 1500);
        valeria.work();
        alice.attendTraining();
        alice.showInfo();
        System.out.println(roman.calculateSalary());
    }
}

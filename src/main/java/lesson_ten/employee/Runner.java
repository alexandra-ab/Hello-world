package lesson_ten.employee;

public class Runner {
    public static void main(String[] args) {
        OfficeEmployee alice = new OfficeEmployee("Алиса", 24, 1000);
        Freelancer roman = new Freelancer("Роман", 35, 200, 5);
        Manager valeria = new Manager("Валерия", 27, 1500, 500);
        valeria.work();
        valeria.attendTraining();
        System.out.println(valeria.calculateSalary());
        alice.attendTraining();
        alice.work();
        alice.showInfo();
        System.out.println(alice.calculateSalary());
        roman.work();
        roman.attendTraining();
        System.out.println(roman.calculateSalary());
    }
}

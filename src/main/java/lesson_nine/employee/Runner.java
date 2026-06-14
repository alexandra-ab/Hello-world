package lesson_nine.employee;

public class Runner {
    public static void main(String[] args) {
        Employee alice = new Employee("Алиса", 24, 60000);
        Employee roman = new Employee("Роман", 47, 80000);
        Employee alexandra = new Employee("Александра", 29, 65000);
        alice.getInfo();
        roman.getInfo();
        alexandra.getInfo();
        alexandra.applyRaise(10.0);
        alexandra.getInfo();
        Employee.showTotalEmployees();
    }
}

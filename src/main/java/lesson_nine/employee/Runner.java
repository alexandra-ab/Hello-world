package lesson_nine.employee;

public class Runner {
    public static void main(String[] args) {
        Employee alice = new Employee("Алиса", 24, 60000);
        Employee roman = new Employee("Роман", 47, 80000);
        Employee alexandra = new Employee("Александра", 29, 65000);
        System.out.println(alice.getInfo());
        System.out.println(roman.getInfo());
        System.out.println(alexandra.getInfo());
        alexandra.applyRaise(10.0);
        System.out.println(alexandra.getInfo());
        Employee.showTotalEmployees();
    }
}

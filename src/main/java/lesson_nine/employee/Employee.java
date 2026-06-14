package lesson_nine.employee;

public class Employee {
    private static int totalEmployees = 0;
    private String name;
    private int age;
    private double salary;
    private double bonus;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = 0;
        calculateBonus();
        totalEmployees++;
    }

    private void calculateBonus() {
        if (this.salary > 70000) {
            this.bonus = 10;
        } else {
            this.bonus = 5;
        }
    }

    public void applyRaise(double percent) {
        this.salary += this.salary * percent / 100;
        if (this.salary > 70000) {
            this.bonus = 10;
        } else {
            this.bonus = 5;
        }
    }

    public void getInfo() {
        String info = String.format("Имя сотрудника: %s, возраст: %d, зарплата %.2f, бонус %.2f.", name, age, salary, bonus);
        System.out.println(info);
    }

    public static void showTotalEmployees() {
        String show = String.format("Всего сотрудников: %d", totalEmployees);
        System.out.println(show);
    }
}

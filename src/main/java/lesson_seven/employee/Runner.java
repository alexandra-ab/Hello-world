package lesson_seven.employee;

public class Runner {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", 25, 1000);
        Manager kate = new Manager("Kate", 33, 1000, 300);
        Intern john = new Intern("John", 20, 2000);
        Intern ron = new Intern("Ron", 19, 500);
        alice.calculateSalary();
        System.out.println(alice);
        kate.calculateSalary();
        System.out.println(kate);
        john.calculateSalary();
        System.out.println(john);
        ron.calculateSalary();
        System.out.println(ron);
    }
}

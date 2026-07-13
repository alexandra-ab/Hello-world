package lesson_eleven.person;

public class Runner {
    public static void main(String[] args) {
        Student alex = new Student("Алекс", 19, 8.9);
        Student roman = new Student("Роман", 19, 6.8);
        Student ludmila = new Student("Людмила", 22, 9.2);
        Student katerina = new Student("Катерина", 20, 7.7);

        Group one = new Group("Первая", 3);
        Group two = new Group("Вторая", 5);
        Group three = new Group("Третья", 5);

        Course java = new Course("Java", 2);
        Course python = new Course("Python", 3);

        one.addStudent(alex);
        one.addStudent(roman);
        one.addStudent(ludmila);
        one.addStudent(katerina);

        two.addStudent(katerina);
        two.addStudent(roman);

        three.addStudent(ludmila);

        java.addGroup(one);
        java.addGroup(two);
        java.addGroup(three);

        python.addGroup(one);

        one.showStudents();

        System.out.println(one.calculateAvarageGrade());
    }
}

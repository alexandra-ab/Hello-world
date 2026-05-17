package lesson_two;

public class TaskTwo {
    public static void main(String[] args) {
        int grade = 6;
        if (grade >= 90) {
            System.out.println("Отлично");
        } else if (grade >= 70 && grade < 90) {
            System.out.println("Хорошо");
        } else if (grade >= 50 && grade < 70) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}

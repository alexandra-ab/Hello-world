package lesson_three;

public class TaskFour {
    public static void main(String[] args) {
        int a = 1;
        while (a < 20) {
            if (a == 15) {
                System.out.println("Особое число: 15");
            } else if (a <= 10) {
                System.out.println("Меньше или равно 10");
            } else {
                System.out.println("Больше 10");
            }
            a++;
        }
    }
}
package lesson_three;

public class TaskTwo {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i < 30) {
                    System.out.println(i + " " + "Меньше 30");
                } else {
                    System.out.println(i + " " + "Больше или равно 30");
                }
            }
        }
    }
}
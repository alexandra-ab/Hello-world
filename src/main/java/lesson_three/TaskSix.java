package lesson_three;

public class TaskSix {
    public static void main(String[] args) {
        int a = 10;
        do {
            if (a == 25) {
                System.out.println("Число 25: особый случай");
            } else if (a < 20) {
                System.out.println("Меньше 20");
            } else {
                System.out.println("20 или больше");
            }
            a++;
        } while (a < 30);
    }
}
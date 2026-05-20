package lesson_three;

public class TaskSeven {
    public static void main(String[] args) {
        int a = 1;
        do {
            if (a == 8) {
                System.out.println("Середина");
            } else if (a < 8) {
                System.out.println("Первая половина");
            } else {
                System.out.println("Вторая половина");
            }
            a++;
        } while (a < 15);
    }
}
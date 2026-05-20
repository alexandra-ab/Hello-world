package lesson_three;

public class TaskFive {
    public static void main(String[] args) {
        int sum = 0;
        int a = 1;
        while (sum <= 100 && a < 50) {
            if (a % 5 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println(sum);
    }
}
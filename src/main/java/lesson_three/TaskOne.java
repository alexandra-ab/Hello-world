package lesson_three;

public class TaskOne {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i * i;
        }
        System.out.println(sum);

        int a = 2;
        while (a < 20) {
            System.out.println(a);
            a += 2;
        }
    }
}
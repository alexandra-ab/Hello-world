package lesson_four;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(4, 10, 15));
        System.out.println(multiply(2, 5, 1));
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

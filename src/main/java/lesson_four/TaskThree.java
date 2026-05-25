package lesson_four;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(45));
        System.out.println(sumOfDigits(91));
        System.out.println(sumOfDigits(12345));
    }

    public static int sumOfDigits(int a) {
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum += digit;
            a = a / 10;
        } return sum;
    }
}

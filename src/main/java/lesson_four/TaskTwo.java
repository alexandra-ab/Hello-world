package lesson_four;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println(isEven(6));
        System.out.println(isEven(3));
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
}

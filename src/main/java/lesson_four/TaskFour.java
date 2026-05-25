package lesson_four;

public class TaskFour {
    public static void main(String[] args) {
        multiplicationTable(5);
        multiplicationTable(3);
    }

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

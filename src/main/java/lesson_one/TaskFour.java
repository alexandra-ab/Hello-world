package lesson_one;

public class TaskFour {
    public static void main(String[] args) {
        String text = "Perfect";
        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);
        System.out.println(last + text.substring(1, text.length() - 1) + first);
    }
}

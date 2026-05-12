package lesson_one;

public class TaskTwo {
    public static void main(String[] args) {
        String name = "It's fine!";
        System.out.println(name.length());
        char first = name.charAt(0);
        System.out.println(first);
        char last = name.charAt(name.length() - 1);
        System.out.println(last);
        System.out.println(name.toUpperCase());

    }
}

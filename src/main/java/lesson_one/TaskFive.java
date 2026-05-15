package lesson_one;

public class TaskFive {
    public static void main(String[] args) {
        String word = "level";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i --) {
            reversed = reversed + word.charAt(i);
        }
        boolean isPalindrome = word.equals(reversed);
        System.out.println(isPalindrome);
    }
}

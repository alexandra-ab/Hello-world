package lesson_fourteen;

import java.util.Stack;

public class TaskThree {
    public static void main(String[] args) {
        String word = "cat";
        Stack<Character> letters = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            letters.push(word.charAt(i));
        }
        String reversedWord = "";
        while (!letters.isEmpty()) {
            reversedWord += letters.pop();
        }
        if (word.equals(reversedWord)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

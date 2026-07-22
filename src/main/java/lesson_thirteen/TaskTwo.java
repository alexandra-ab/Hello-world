package lesson_thirteen;

import java.util.*;

public class TaskTwo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("John");
        names.add("Alice");
        Set<String> uniqueNames = new HashSet<>(names);
        for (String name : names) ;
        System.out.println(uniqueNames);

        Set<String> forbiddenWords = new HashSet<>();
        forbiddenWords.add("bad");
        forbiddenWords.add("ugly");
        forbiddenWords.add("nasty");
        String word = "cat";
        if (forbiddenWords.contains(word)) {
            System.out.println("Forbidden word!");
        } else {
            System.out.println("Word is allowed!");
        }

        Set<String> tasks = new LinkedHashSet<>();
        tasks.add("Buy milk");
        tasks.add("Buy eggs");
        tasks.add("Buy bread");
        tasks.add("Buy milk");
        tasks.add("Buy apples");
        System.out.println(tasks);

        Random random = new Random();
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(random.nextInt(30));
        }
        System.out.println(numbers);

        TreeSet<String> studentsNames = new TreeSet<>();
        studentsNames.add("John");
        studentsNames.add("Bob");
        studentsNames.add("Alice");
        studentsNames.add("Rick");
        studentsNames.add("Alice");
        studentsNames.add("Oliver");
        System.out.println(studentsNames);
    }
}

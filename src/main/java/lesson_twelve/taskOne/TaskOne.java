package lesson_twelve.taskOne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TaskOne {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Go to the store");
        tasks.add("Clean the apartment");
        tasks.add("Call the clinic!");
        tasks.add("Get a manicure");
        tasks.add("Send a parcel");

        System.out.println(String.format("The third item on the list of tasks: %s", tasks.get(2)));

        tasks.remove(1);
        tasks.set(3, "Watch the movie");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }

        tasks.add("Send a parcel");

        String longest = tasks.get(0);
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).length() > longest.length()) {
                longest = tasks.get(i);
            }
        }
        System.out.println(String.format("The longest line: %s.", longest));

        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).equals("Go to the store")) {
                System.out.println(String.format("Index: %d", i));
                break;
            } else {
                System.out.println("Element not found");
            }
        }

        for (String task : tasks) {
            System.out.println(task);
        }
        Collections.sort(tasks);
        for (String task : tasks) {
            System.out.println(String.format("Sorted list: %s", task));
        }

        tasks.clear();
        System.out.println(tasks.size());
    }
}

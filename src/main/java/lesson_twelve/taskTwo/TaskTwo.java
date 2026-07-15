package lesson_twelve.taskTwo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TaskTwo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addLast(30);
        numbers.addFirst(5);

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        numbers.removeFirst();
        numbers.removeLast();
        for (int i= 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        numbers.add(7);
        numbers.add(1);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

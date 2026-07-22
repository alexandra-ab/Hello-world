package lesson_fourteen;

import java.util.PriorityQueue;

public class TaskOne {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(49);
        numbers.add(33);
        numbers.add(0);
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}

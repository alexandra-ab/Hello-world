package lesson_fourteen;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskTwo {
    public static void main(String[] args) {
        Deque<String> tasks = new ArrayDeque<>();
        tasks.addLast("Обновить документы");
        tasks.addLast("Исправить баг");
        tasks.addLast("Запустить сборку");
        tasks.pollFirst();
        tasks.pollLast();
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}

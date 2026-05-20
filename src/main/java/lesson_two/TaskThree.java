package lesson_two;

public class TaskThree {
    public static void main(String[] args) {
        String days = "Воскресенье";
        int temperature = 4;
        boolean isWeekend = days.equals("Суббота") || days.equals("Воскресенье");
        if (isWeekend) {
            if (temperature >= 20) {
                System.out.println("Можно пойти на пикник");
            } else {
                System.out.println("Лучше остаться дома");
            }
        } else {
            System.out.println("Сегодня работать!");
        }
    }
}
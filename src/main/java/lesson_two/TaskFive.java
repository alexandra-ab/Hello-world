package lesson_two;

public class TaskFive {
    public static void main(String[] args) {
        int age = 44;
        String zone = "обычная";
        String timeOfDay = "утро";
        if (age <= 12) {
            if (zone.equals("VIP")) {
                System.out.println("Детский VIP-билет");
            } else {
                System.out.println("Детский билет");
            }
        } else if (age > 12 && age <= 60) {
            if (zone.equals("VIP")) {
                if (timeOfDay.equals("вечер")) {
                    System.out.println("Вечерний VIP-билет");
                } else {
                    System.out.println("Обычный VIP-билет");
                }
            } else if (zone.equals("обычная")) {
                if (timeOfDay.equals("утро")) {
                    System.out.println("Утренний билет");
                } else {
                    System.out.println("Стандарный билет");
                }
            }
        } else {
            if (zone.equals("VIP")) {
                System.out.println("Пенсионный VIP-билет");
            } else {
                System.out.println("Пенсионный билет");
            }
        }
    }
}
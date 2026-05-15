package lesson_two;

public class TaskOne {
    public static void main(String[] args) {
        double temperature = 20;
        if (temperature >= 0 && temperature < 20) {
            System.out.println("Тепло");
        } else if (temperature >= 20) {
            System.out.println("Жарко");

        } else {
            System.out.println("Холодно");
        }


        int age = 17;
        String gender = "Male";
        if (age > 16) {
            if (gender.equals("Famale")) {
                System.out.println("Цветок");
            } else {
                System.out.println("Носки");
            }
        } else if (age == 16) {
            System.out.println("Торт");
        } else {
            System.out.println("Щарик");
        }
    }
}

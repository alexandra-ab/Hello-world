package lesson_nine;

public class TernaryOperator {
    public static void main(String[] args) {
        int year = 2028;
        String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "Високосный год" : "Не високосный год";
        System.out.println(result);

        int temperature = -2;
        String resultTemperature = (temperature <= 0) ? "Холодно" :
                (temperature) < 20 ? "Прохладно" : "Тепло";
        System.out.println(resultTemperature);

        int a = 23;
        int b = 9;
        int smallerNumber = (a < b) ? a : b;
        System.out.println(smallerNumber);

        int c = 19;
        String division = (c % 5 == 0 && c % 3 == 0) ? "Число делится на 5 и 3." : "Число не делится на 5 и 3.";
        System.out.println(division);
    }
}

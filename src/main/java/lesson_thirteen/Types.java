package lesson_thirteen;

public class Types {
    public static void main(String[] args) {
        String numbers = "12345";
        int intNumber = Integer.parseInt(numbers);
        System.out.println(intNumber);
        float floatNumber = Float.parseFloat(numbers);
        System.out.println(floatNumber);
        double doubleNumber = Double.parseDouble(numbers);
        System.out.println(doubleNumber);

        Integer integer = Integer.valueOf(numbers);
        System.out.println(integer);
        Float floatWrapper = Float.valueOf(numbers);
        System.out.println(floatWrapper);
        Double doubleWrapper = Double.valueOf(numbers);
        System.out.println(doubleWrapper);

        int number = 121;
        int original = number;
        int reverse = 0;
        while (number > 0) {
            int i = number % 10;
            reverse = reverse * 10 + i;
            number /= 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        Integer num = 125;
        String text = num.toString();
        String reverseInteger = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseInteger += text.charAt(i);
        }
        if (text.equals(reverseInteger)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        Integer a = 15;
        Integer b = 15;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

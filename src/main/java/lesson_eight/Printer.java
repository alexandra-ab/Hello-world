package lesson_eight;

public class Printer {
    public String print(String title) {
        System.out.println(title);
        return title;
    }

    public int print(int a) {
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        Printer printerOne = new Printer();
        printerOne.print(5);
        printerOne.print("Hello");
    }
}

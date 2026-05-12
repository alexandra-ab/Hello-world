package lesson_one;

public class TaskThree {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.2;
        double c = 8.7;
        double avg = (a + b + c)/3;
        System.out.println(avg);
        int lowerBound = 0;
        int upperBound = 10;
        boolean results = (avg >= lowerBound) && (avg <= upperBound);
        System.out.println(results);
    }
}

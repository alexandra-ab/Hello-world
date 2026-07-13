package lesson_eleven.person;

public class Student extends Person{
    private double averageGrade;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void showInfo() {
        System.out.println(String.format("Студент: %s; возаст: %d; средняя оценка: %.2f", getName(), getAge(), averageGrade));
    }
}

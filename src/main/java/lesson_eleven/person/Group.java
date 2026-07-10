package lesson_eleven.person;

public class Group {
    private String groupName;
    private int studentCount;
    private int maxStudents;
    private Student []students;

    public Group(String groupName, int maxStudents) {
        this.groupName = groupName;
        this.studentCount = 0;
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
    }

    public String getGroupName() {
        return groupName;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println(String.format("В группу %s зачисленно %d студент(а).", groupName, studentCount));
        } else {
            System.out.println(String.format("Группа %s набрана.", groupName));
        }
    }

    public double calculateAvarageGrade() {
        if (studentCount == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < studentCount; i++) {
            sum += students[i].getAverageGrade();
        }
        return sum / studentCount;
    }

    public void showStudents() {
        System.out.println(String.format("Список студентов в группе: %s", groupName));
        for (int i = 0; i < studentCount; i++) {
        students[i].showInfo();
        }
    }
}

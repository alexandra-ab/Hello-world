package lesson_eleven.person;

public class Course {
    private String courseName;
    private int groupCount;
    private int maxGroup;
    private Group[] groups;

    public Course(String courseName, int maxGroup) {
        this.courseName = courseName;
        this.groupCount = 0;
        this.groups = new Group[maxGroup];
    }

    public void addGroup(Group group) {
        if (groupCount < groups.length) {
            groups[groupCount] = group;
            groupCount++;
            System.out.println(String.format("На курс %s зачислено %d групп(ы).", courseName, groupCount));
        } else {
            System.out.println(String.format("Курс %s набрана.", courseName));
        }
    }
}

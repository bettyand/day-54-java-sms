import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalEarned;
    private static int totalSpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalEarned = 0;
        totalSpent = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return this.students;
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getTotalEarned() {
        return totalEarned;
    }
    public static void updateTotalEarned(int earned) {
        totalEarned += earned;
    }

    public int getTotalSpent() {
        return totalSpent;
    }
    public static void updateTotalSpent(int spent) {
        totalSpent -= spent;
    }
}

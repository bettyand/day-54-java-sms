import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher melissa = new Teacher(2,"Melissa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",12);
        Student rabbi = new Student(3,"Rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School ghs = new School(teacherList, studentList);

        ghs.addTeacher(new Teacher(6, "Megan", 900));

        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalEarned());

        System.out.println("-----Making SCHOOL PAY SALARY-----");
        lizzy.paySalary(lizzy.getSalary());
        System.out.println("GHS has paid salary to " + lizzy.getName() +" and now has $" + ghs.getTotalEarned());

        vanderhorn.paySalary(vanderhorn.getSalary());
        System.out.println("GHS has paid salary to " + vanderhorn.getName() +" and now has $" + ghs.getTotalEarned());

        System.out.println(rakshith);

        melissa.paySalary(melissa.getSalary());
        System.out.println(melissa);
    }
}

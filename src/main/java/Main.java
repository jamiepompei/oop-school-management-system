import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy =  new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher jon = new Teacher(3, "Jon", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(jon);

        Student jessie = new Student(1, "Jessie", 4);
        Student kyle = new Student(2, "Jon", 12);
        Student sarah = new Student(3, "Sarah", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jessie);
        studentList.add(kyle);
        studentList.add(sarah);

        School ghs = new School(teacherList, studentList);
        Teacher megan = new Teacher(6,"Megan", 900);
        ghs.addTeacher(megan);

        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        sarah.payFees(5000);
        kyle.payFees(7000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("-----MAKING GHS PAY SALARY TO TEACHERS-------");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.print("GHS has paid salary to " + lizzy.getName()
                +" and now has $" + ghs.getTotalMoneyEarned() + ".");
        melissa.receiveSalary(melissa.getSalary());
        System.out.println("\nGHS has paid salary to " + melissa.getName()
                +" and now has $" + ghs.getTotalMoneyEarned() + ".");

        System.out.println(melissa);
        System.out.println(sarah);

    }
}

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and students using an ArrayList.
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in school
     * @param student list of students in school
     */
    public School(List<Teacher> teachers, List<Student> student) {
        this.teachers = teachers;
        this.students = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
       teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to the school
     * @param student student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds to the total money earned by the school
     * @param MoneyEarned money that is suposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school whh is the salary given by the school
     * to its teachers
     * @param totalMoneySpent the money spent by school
     */
    public static void updateTotalMoneySpent(int totalMoneySpent) {
        totalMoneyEarned -= totalMoneySpent;
    }
}

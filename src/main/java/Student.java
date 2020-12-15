/** This class is responsible for keeping track of students fees,
 * name, grade, & fees paid.
 *
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *To create a new student by initializing
     * Fees for every student is $30,000 per year.
     * Fees paid initially is 0.
    @param id for the student: uniqe
    @param name of the student
    @param grade of the student
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //not going to alter student's name, students id.


    public int getGrade() {
        return grade;
    }

    /**
     * Used to updeate the student's grade
     * @param grade new grade of the student
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding fees to fees paid field.
     * Add the fees to the fees paid.
     * The school is going to recieve the funds.
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name+
                "\nTotal fees paid so far: $"+ feesPaid;
    }
}

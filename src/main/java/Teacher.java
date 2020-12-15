/**
 * This class is responsible for keeping track of teaher's name, id, salary.
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return salary of teacher
     */

    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary  set the salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to salaryEarned
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name +
                "\nTotal Salary earned so far: $" + salaryEarned;
    }
}

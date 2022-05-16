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

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void paySalary(int salary) {
        salaryEarned += salary;
        School.updateTotalSpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + this.name + ", Total salary earned so far: $" + this.salaryEarned;
    }
}

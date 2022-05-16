public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }
    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalEarned(this.feesPaid);
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    public int getRemainingFees() {
        return this.feesTotal - this.feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + ", Total fees paid so far: $" + feesPaid;
    }
}

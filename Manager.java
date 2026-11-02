public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, String employeeId, String department,
                   double monthlySalary, int teamSize) {

        super(name, employeeId, department, monthlySalary);

        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            this.teamSize = 0;
        }
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            System.out.println("Team size cannot be negative.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
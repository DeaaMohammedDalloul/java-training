public class Manager extends Employee{
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double ManagerReward(){
        return getSalary() * 0.15;
    }

    public void printManager(){
        printEmployee();
        System.out.println("department: " + department );
        System.out.println("Reward: " + ManagerReward());
        System.out.println("Final Salary: " + (getSalary() + ManagerReward()));
    }
}

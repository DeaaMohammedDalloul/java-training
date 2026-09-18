public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name , int id , double salary){
        this.name = name;
        this.id = id;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0){
            this.salary = salary;

        }else {
            System.out.println("Salary cannot be negative ");
            this.salary = 0;
        }
    }

    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
    public double calculateBonus(){
        return salary * 0.05;
    }
}

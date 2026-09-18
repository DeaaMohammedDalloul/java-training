public class  Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployee(){
//        System.out.println("Name: " + getName());
//        System.out.println("Age: " + getAge());

        displayPerson();
        System.out.println("employeeId: "+ employeeId);
        System.out.println("salary: "+ salary);
    }

    }

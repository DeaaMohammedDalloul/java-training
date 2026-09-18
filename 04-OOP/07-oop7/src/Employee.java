public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        if (salary >= 1000){
            this.salary = salary + (0.10*salary);
        }else{
            this.salary = salary;
        }
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
        if (salary >= 1000){
            this.salary = salary + (0.10*salary);
        }else{
            this.salary = salary;
        }
    }

    private double salary;



    public double calculateAnnualSalary(){
        return salary * 12 ;
    }
    public void increaseSalary(double percentage){
        if (salary >= 1000){
            salary +=(0.10 * 1000);
        }else{
            this.salary = salary;
        }
    }
    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("Salary: "+ salary);
    }

}

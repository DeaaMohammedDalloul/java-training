public class Employee {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name ;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void checkSalary(){
        if (this.salary > 200){

            System.out.println("Super Employee");
        }

    }
    public void printfull(){
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}

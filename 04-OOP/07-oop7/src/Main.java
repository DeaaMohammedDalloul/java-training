public class Main {
    /*
    السؤال الرابع — موظف

أنشئ class اسمه Employee يحتوي على:

private String name;
private int id;
private double salary;

أضف الدوال:

public double calculateAnnualSalary()
public void increaseSalary(double percentage)
public void displayInfo()

مثال: إذا كان الراتب 1000 وزادت نسبته 10% يصبح 1100.

امنع إدخال راتب أو نسبة زيادة سالبة.

     */
    static void main(String[] args) {
        Employee emp1 = new Employee("deaa" , 2004 , 1000);
        Employee emp2 = new Employee("ahmed" , 2001 , 500);

        emp1.setSalary(2000);
        emp2.setSalary(1500);


        emp1.displayInfo();
        System.out.println( "calculate Annual Salary: " +emp1.calculateAnnualSalary() + " USD");
        System.out.println("____________________________");
        emp2.displayInfo();
        System.out.println( "calculate Annual Salary: " +emp2.calculateAnnualSalary() + " USD");
    }
}
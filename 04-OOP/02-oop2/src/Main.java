import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        Employee [] E1 = new Employee[in.nextInt()];
//        Employee E2 = new Employee();

        for (int i = 0 ; i < E1.length ; ++i){
            System.out.print("Enter Name: ");
            in.nextLine();

            String name = in.nextLine();
            System.out.print("Enter Salary: ");
           double salary = in.nextDouble();
            E1[i] = new Employee(name,salary);

            E1[i].printfull();
            E1[i].checkSalary();
            System.out.println("\n==========================\n");



        }
//        for (int i = 0 ; i < E1.length ; ++i){
//          E1[i].printfull();
//        }




//        System.out.print("Enter Name: ");
//        String name = in.nextLine();
//        System.out.print("Enter Salary: ");
//        double Salary = in.nextDouble();
//
//        Employee E1 = new Employee(name, Salary);
//        System.out.println(E1.name);
//        System.out.println(E1.salary);
//
//        E1.checkSalary();

    }
}
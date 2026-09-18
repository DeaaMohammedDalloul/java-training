import java.util.Scanner;

public class tast1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        System.out.print("Enter the monthly salary: ");
        double salary = in.nextDouble();
        System.out.print("Enter the number of years of experience: ");
        double years = in.nextDouble();
        System.out.print("Enter the number of working days in the month: ");
        double days = in.nextDouble();

        double  totalhours = 0;

        for (int i = 1; i <= days; ++i) {
            System.out.print("Enter working hours for days"+ " " + i + ": ");
            double hours = in.nextDouble();
            totalhours += hours;
        }

        double fee = 0;
        if (totalhours >= 200){
            fee = 0.20 ;

        } else if (totalhours >= 150 && totalhours < 200) {

            fee = 0.10;

        } else {
            fee = 0;
        }

        if (years >= 5){
            fee += 0.05 ;
        }

        double totalfainl  = (salary + (salary * fee));

        double reward = salary * fee ;


        System.out.println("Name : " + name);
        System.out.println(" salary : " + salary);
        System.out.println(" total hours : " + totalhours);
        System.out.println("The reward : " + reward);
        System.out.println("The salary is okay : " + totalfainl);



    }


}




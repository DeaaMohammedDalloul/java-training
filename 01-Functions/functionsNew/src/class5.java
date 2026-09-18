import java.util.Scanner;

public class class5 {

    static double Addition (double num1 , double num2){

        return num1 + num2 ;
    }
    static double Subtraction (double num1 , double num2){

        return num1 - num2 ;
    }
    static double Multiplication (double num1 , double num2){
        return num1 * num2 ;
    }
     static double Division (double num1 , double num2){

        return num1 / num2 ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number one: ");
        double num1 = in.nextDouble();

        System.out.print("Enter Number tow: ");
        double num2 = in.nextDouble();

        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");

        int cho = 0;

        do {
            System.out.print("Enter choice: ");
            cho = in.nextInt();

            switch (cho) {
                case 1:
                    System.out.println("Addition = " + Addition(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction = " + Subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication = " + Multiplication(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Division = " + Division(num1, num2));
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Error Enter ");
            }



        }while (cho != 5);

        in.close();

    }



}

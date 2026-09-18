import java.util.Scanner;

public class tast7 {
    static void main(String[] args) {
        /*
        اكتب برنامج Java يطلب من المستخدم إدخال رقم موجب، ويستمر في طلب رقم جديد إذا أدخل رقمًا سالبًا أو صفرًا.
         */
        Scanner in = new Scanner(System.in);
        double number;
        do {
            System.out.print("Enter Even Number: ");
             number = in.nextDouble();

             if (number <= 0){

                 System.out.println("Invalid number");
             }
        }while (number <= 0);
            System.out.println(" Valid number: " + number);

            System.exit(0);


    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;

        do {
            System.out.print("Enter positive number: ");
            x = in.nextInt();

            if (x <= 0) {
                System.out.println("Invalid number!");
            }

        } while (x <= 0);

        System.out.println("Valid number: " + x);

        in.close();
    }
}

 */

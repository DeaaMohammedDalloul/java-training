import java.util.Scanner;

public class tast2 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        System.out.print("Enter the number of products you bought: ");
        int num = in.nextInt();

        double total = 0;

        for (int i = 1 ; i <= num ; ++i){
            System.out.print("Enter the product price "+ i + " = " );
            double price = in.nextDouble();

            total += price;


        }
        double fee = 0;
         if ( total >= 500){
             fee = 0.20;

         } else if ( total >= 300 && total < 500) {
             fee = 0.15;

         } else if ( total >= 100 && total < 300 ) {
             fee = 0.10;

         }else {
             fee = 0;

         }

        System.out.println("Name: " + name);
        System.out.println(" the number of products you bought: " + num);
        System.out.println("Discount befor total: " + total);
        System.out.println("Discount value: " + (total * fee));
        System.out.println(" Discount aftar total: " + (total - (total * fee)));

    }
}

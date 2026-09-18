import java.util.Scanner;

public class functionsMath3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number one: ");
        double num = in.nextDouble();
        System.out.print("Enter Number tow: ");
        double num2 = in.nextDouble();

        int cho;
        do {

            System.out.println("1: Absolute Value");
            System.out.println("2: Square Root");
            System.out.println("3: Power");
            System.out.println("4: Maximum Number");
            System.out.println("5: Minimum Number");
            System.out.println("6: Round Number");
            System.out.println("7: Ceil Number");
            System.out.println("8: Floor Number ");
            System.out.println("9: Random Number");
            System.out.println("10: Exit ");
            System.out.print("Enter choice: ");
             cho = in.nextInt();

             switch (cho){
                 case 1:
                     System.out.println(Math.abs(num));
                     break;
                 case 2:
                     if (num >= 0 ){
                         System.out.println(Math.sqrt(num));
                     }else
                         System.out.println("cannot calculate square root of a negative number");
                     break;
                 case 3:
                     System.out.println(Math.pow(num,num2));
                     break;
                 case 4:
                     System.out.println(Math.max(num,num2));
                     break;
                 case 5:
                     System.out.println(Math.min(num,num2));
                     break;
                 case 6:
                     System.out.println(Math.round(num));
                     break;
                 case 7:
                     System.out.println(Math.ceil(num));
                     break;
                 case 8:
                     System.out.println(Math.floor(num));
                     break;
                 case 9:
                     int x = (int)(Math.random()* 100 +1);
                     System.out.println(x);
                     break;
                 case 10:
                     System.out.println("Program Closed ");
                     break;
                 default:
                     System.out.println("Error Enter ");
             }
        }while (cho != 10 );
        in.close();
    }
}

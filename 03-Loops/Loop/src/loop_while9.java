import java.util.Random;
import java.util.Scanner;

public class loop_while9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int fnum = 0;
        Random out = new Random();
        int snum = out .nextInt(20);

        while (fnum != snum){
            System.out.print("Enter Number: ");
            fnum = in.nextInt();


             if (fnum > snum){
                 System.out.println("اصغر ");


             }else if (fnum < snum) {
                 System.out.println("اكبر ");
             }

        }

        System.out.println( "The Number: " +fnum);
        System.out.println( "The Number: " +snum);
    }
}

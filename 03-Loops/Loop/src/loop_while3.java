import java.util.Scanner;

public class loop_while3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Password: ");
       int pass = in.nextInt();
         int dee= 2004;
         int count = 0;


         while (pass != dee){
             System.out.print("Enter Password: ");
              pass = in.nextInt();
              count++;
              if (count >= 3){
                  System.out.println("انتهت محاولات الادخال");
                  break;
              }

         }
         if (pass == dee) {
             System.out.println("correct password");
         }
    }
}

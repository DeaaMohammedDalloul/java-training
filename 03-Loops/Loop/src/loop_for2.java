import java.util.Scanner;

public class loop_for2 {
    static void main() {
        /*
        7. for loop: اطلب من المستخدم رقماً، ثم احسب مجموع الأعداد من 1 حتى هذا الرقم.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int total = 0 ;
        for (int i = 1 ; i <= num ; ++i ){

            total += i ;
        }
        System.out.println(total);
    }
}

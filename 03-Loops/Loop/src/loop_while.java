import java.util.Scanner;

public class loop_while {
    static void main(String[] args) {
        /*
        8. while loop : اطلب من المستخدم رقماً N، ثم اطبع الأرقام من 1 إلى N باستخدام while.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextByte();
        int i = 1;
        int total = 0;
        while (i <= n){

             total+=i;  // 15
             ++i;

        }
        System.out.println(total);

    }
}

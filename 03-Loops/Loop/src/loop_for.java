import java.util.Scanner;

public class loop_for {
    static void main(String[] args) {
        /*
        6. for loop: اطلب من المستخدم رقماً، ثم اطبع جدول ضرب هذا الرقم من 1 إلى 10.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();

        for (int i = 1 ; i <= 10 ; ++i){
            System.out.println( i + " * " + num + " = " +(i*num));
        }
    }
}

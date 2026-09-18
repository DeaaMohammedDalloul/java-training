import java.util.Scanner;

public class tast6 {
    /*
    أكيد، سؤال على do-while:

السؤال:
اكتب برنامج Java يطلب من المستخدم إدخال رقم، ويستمر في طلب رقم جديد حتى يدخل الرقم 0.

مثال:

Enter number: 5
Enter number: 8
Enter number: 3
Enter number: 0
Program ended

تلميح: استخدم Scanner مع do-while. لا تحتاج إلى مصفوفات.
     */
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int x ;
        do {
            System.out.print("Enter number: ");
            x = in.nextInt();


        }while (x != 0);
            System.out.println("Enter finished");
            System.exit(0);

    }
}
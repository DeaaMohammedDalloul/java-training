import java.util.Scanner;

public class do_while3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*

اكتب برنامج Java يطلب من المستخدم إدخال رقم موجب.

المطلوب:

* استخدم حلقة do-while.
* إذا أدخل المستخدم 0 أو رقمًا سالبًا، اطبع:

Invalid Number

* استمر في طلب الرقم حتى يُدخل المستخدم رقمًا أكبر من 0.
* بعد إدخال رقم صحيح، استخدم حلقة do-while أخرى لطباعة جدول ضرب الرقم من 1 إلى 10.

مثال للتشغيل:

Enter a positive number: -4
Invalid Number
Enter a positive number: 0
Invalid Number
Enter a positive number: 5
5 × 1 = 5
5 × 2 = 10
5 × 3 = 15
5 × 4 = 20
5 × 5 = 25
5 × 6 = 30
5 × 7 = 35
5 × 8 = 40
5 × 9 = 45
5 × 10 = 50

ملاحظة: المطلوب استخدام حلقتين do-while؛ الأولى للتحقق من الرقم، والثانية لطباعة جدول الضرب.
         */
        int num;
         do {
             System.out.print("Enter Number: ");
             num = in.nextInt();

             if (num <= 0) {
                 System.out.println("nvalid NumberI");

             }
         }while (num <= 0);

        int i = 1;

            do {
                    System.out.println(num + " * " + i + " = " + (num * i));
                    ++i;


            } while (i <= 10);
in.close();
    }
}

import java.util.Scanner;

public class do_while2 {
    static void main(String[] args) {
        /*
        أكيد يا هندس، هذا السؤال الثاني على do-while:

اكتب برنامج Java يعرض القائمة التالية للمستخدم:

===== Calculator =====
1. Addition
2. Subtraction
3. Exit

المطلوب:
* استخدم حلقة do-while لعرض القائمة مرة واحدة على الأقل.
* اطلب من المستخدم اختيار رقم من القائمة.
* إذا اختار 1:
    * اطلب منه إدخال رقمين.
    * اطبع حاصل جمعهما.
* إذا اختار 2:
    * اطلب منه إدخال رقمين.
    * اطبع حاصل طرح الرقم الثاني من الأول.
* إذا اختار 3، اطبع:
Program Closed

* إذا أدخل اختيارًا غير 1 أو 2 أو 3، اطبع:
Invalid Choice

* استمر في عرض القائمة حتى يختار المستخدم 3.

مثال:
===== Calculator =====
1. Addition
2. Subtraction
3. Exit
Enter choice: 1
Enter first number: 8
Enter second number: 4
Result: 12
===== Calculator =====
1. Addition
2. Subtraction
3. Exit
Enter choice: 3
Program Closed
         */

        Scanner in = new Scanner(System.in);
        int cho;
        do {
            System.out.println("===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.print("Number choose:  ");
            cho = in.nextInt();

            switch (cho) {
                case 1:
                    System.out.print("Enter first number: ");
                    int x = in.nextInt();
                    System.out.print("Enter second number: ");
                    int y = in.nextInt();
                    System.out.println("Result : " + (x + y));
                    break;
                case 2:
                    System.out.print("Enter first number: ");

                    int z = in.nextInt();
                    System.out.print("Enter second number: ");
                    int d = in.nextInt();
                    System.out.println("Result : " + (z - d));
                    break;
                case 3:
                    System.out.println("Program Closed");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }


        } while (cho != 3) ;
        in.close();
    }
}

import java.util.Scanner;

public class tast8 {
    static void main(String[] args) {
        /*
        اكتب برنامج Java يقوم بالآتي:

يطلب من المستخدم إدخال رقم.
يجب أن يكون الرقم بين 1 و10.
إذا أدخل المستخدم رقمًا خارج النطاق، اطبع: Invalid number!
استمر في طلب رقم جديد حتى يدخل المستخدم رقمًا صحيحًا.
عندما يدخل المستخدم رقمًا صحيحًا، اطبع: Valid number: الرقم
مثال التشغيل:
Enter number: 15
Invalid number!

Enter number: -2
Invalid number!

Enter number: 7
Valid number: 7
         */

                Scanner input = new Scanner(System.in);
                int number;
                while (true) {
                    System.out.print("Enter number: ");
                    number = input.nextInt();

                    if (number >= 1 && number <= 10) {
                        System.out.println("Valid number: " + number);
                        break;
                    } else {

                        System.out.println("Invalid number!");
                        System.out.println();
                    }
                }

                input.close();
            }
        }


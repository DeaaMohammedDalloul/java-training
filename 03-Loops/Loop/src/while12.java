import java.util.Scanner;

public class while12 {
    static void main(String[] args) {
        /*
        🔴 السؤال الشامل — تحليل مجموعة أرقام

اكتب برنامج Java يطلب من المستخدم إدخال أرقام واحدًا تلو الآخر.

يتوقف البرنامج في إحدى الحالتين:

* عندما يُدخل المستخدم الرقم 0.
* أو بعد إدخال 10 أرقام.

المطلوب

استخدم while لتنفيذ الآتي:

* حساب عدد الأرقام الموجبة.
* حساب عدد الأرقام السالبة.
* حساب عدد الأرقام الزوجية.
* حساب عدد الأرقام الفردية.
* حساب مجموع الأرقام المدخلة.
* إيجاد أكبر رقم.
* إيجاد أصغر رقم.
* حساب عدد الأرقام التي أدخلها المستخدم.

الرقم 0 مخصص لإنهاء البرنامج، لذلك لا يدخل في العد أو المجموع.

مثال للتشغيل

Enter number: 8
Enter number: -3
Enter number: 6
Enter number: -5
Enter number: 0
===== Results =====
Numbers entered: 4
Positive numbers: 2
Negative numbers: 2
Even numbers: 2
Odd numbers: 2
Sum: 6
Largest number: 8
Smallest number: -5

إذا أدخل المستخدم 0 من البداية، اطبع:

No numbers entered

الشروط

* استخدم while وif / else فقط.
* ممنوع استخدام for.
* ممنوع استخدام do-while.
* ممنوع استخدام break.
* ممنوع استخدام المصفوفات Array.
* الحد الأقصى هو 10 أرقام.

تلميح صغير: عند إدخال أول رقم، اجعله القيمة الأولية لكل من largest وsmallest.
         */

        Scanner in = new Scanner(System.in);

        int count = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;
        int largest = 0;
        int smallest = 0;

        System.out.print("Enter Number: ");
        int num = in.nextInt();

        while (num != 0 && count < 10) {

            // عدّ الأرقام الموجبة والسالبة
            if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            // عدّ الأرقام الزوجية والفردية
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // إضافة الرقم إلى المجموع
            sum += num;

            // أول رقم يكون أكبر وأصغر رقم مؤقتًا
            if (count == 0) {
                largest = num;
                smallest = num;
            } else {

                if (num > largest) {
                    largest = num;
                }

                if (num < smallest) {
                    smallest = num;
                }
            }

            // زيادة عدد الأرقام المدخلة
            count++;

            // طلب رقم جديد إذا لم نصل إلى 10 أرقام
            if (count < 10) {
                System.out.print("Enter Number: ");
                num = in.nextInt();
            }
        }

        // طباعة النتائج
        if (count == 0) {
            System.out.println("No numbers entered");
        } else {
            System.out.println("===== Results =====");
            System.out.println("Numbers entered: " + count);
            System.out.println("Positive numbers: " + positiveCount);
            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);
            System.out.println("Sum: " + sum);
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }

        in.close();
    }
}





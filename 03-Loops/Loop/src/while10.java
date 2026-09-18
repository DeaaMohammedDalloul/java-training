import java.util.Scanner;

public class while10 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        ⸻

🔴 السؤال الثاني — PIN وثلاث محاولات

اكتب برنامج Java يحتوي على PIN صحيح:

int correctPin = 1234;

المستخدم لديه 3 محاولات فقط لإدخال الـ PIN الصحيح.

المطلوب:

* استخدم while.
* أنشئ متغيرًا لحساب عدد المحاولات.
* اطلب من المستخدم إدخال PIN.
* إذا كان PIN صحيحًا، اطبع:

Access Granted

وتنتهي عملية المحاولات.

* إذا كان PIN خاطئًا، اطبع:

Wrong PIN

* إذا أخطأ المستخدم 3 مرات، اطبع:

Account Locked

مثال نجاح:

Enter PIN: 5555
Wrong PIN
Enter PIN: 1111
Wrong PIN
Enter PIN: 1234
Access Granted

مثال فشل:

Enter PIN: 5555
Wrong PIN
Enter PIN: 2222
Wrong PIN
Enter PIN: 9999
Wrong PIN
Account Locked

الشروط: استخدم while و if / else فقط، وبدون for أو do-while أو break.

حل الأول لحالك أولًا، وبعدها الثاني؛ الثاني هو الاختبار الحقيقي لفهمك للـ while.
         */
        int correctPin = 1234;
        int count = 0;
        int pin = 0 ;

        while (count < 3 && pin != correctPin){
            System.out.print("Enter PIN: ");
            pin = in.nextInt();

            if (correctPin == pin){
                System.out.println("Access Granted");

            }else {
                System.out.println("Wrong PIN");
                ++count;
            }


        }
        if (pin != correctPin){
            System.out.println("Account Locked");


        }


    }
}

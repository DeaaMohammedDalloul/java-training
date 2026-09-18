import java.util.Scanner;

public class loop_while6 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*

🟢 سؤال while — تجميع المبالغ

اكتب برنامج Java يطلب من المستخدم إدخال مبالغ مالية واحدًا تلو الآخر.

المطلوب:

* أنشئ متغيرًا total يبدأ من 0.
* استمر في طلب مبلغ من المستخدم باستخدام while.
* إذا أدخل المستخدم رقمًا موجبًا، أضفه إلى total.
* إذا أدخل رقمًا سالبًا، اطبع:

Invalid Amount

ولا تضفه إلى المجموع.

* إذا أدخل المستخدم 0، أوقف الـ while.
* في النهاية اطبع مجموع المبالغ:

Total: 350.0

مثال تشغيل:

Enter amount: 100
Enter amount: 50
Enter amount: -20
Invalid Amount
Enter amount: 200
Enter amount: 0
Total: 350.0

الشروط: استخدم فقط while و if / else، ولا تستخدم for أو do-while أو break.

هذا السؤال يعلمك نقطة مهمة جدًا: كيف تجعل قيمة معينة (0) هي التي تنهي الـ while.
         */
        double total = 0;
        System.out.print("Enter mane: ");
        double mane = in.nextDouble();
         while ( mane > 0 || mane < 0 ){            // ( mane != 0 )

             if (mane > 0){
                 total +=mane;
             }else {
                 System.out.println("Invalid Amount");
             }



             System.out.print("Enter mane: ");
             mane = in.nextDouble();
         }
        System.out.println( "total: " +total);
    }
}

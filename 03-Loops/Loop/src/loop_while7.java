import java.util.Scanner;

public class loop_while7 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        السؤال الأول — عدّ الأرقام الموجبة والسالبة

اكتب برنامج Java يطلب من المستخدم إدخال أرقام واحدًا تلو الآخر.

المطلوب:

* أنشئ متغير positiveCount لحساب عدد الأرقام الموجبة.
* أنشئ متغير negativeCount لحساب عدد الأرقام السالبة.
* استخدم while للاستمرار في إدخال الأرقام.
* إذا كان الرقم أكبر من 0، زِد positiveCount بمقدار 1.
* إذا كان الرقم أقل من 0، زِد negativeCount بمقدار 1.
* عندما يدخل المستخدم 0، أوقف الـ while.
* في النهاية اطبع عدد الأرقام الموجبة والسالبة.
* ممنوع: for و do-while و break
         */
        System.out.print("Enter Number: ");
        int num = in.nextInt();

        double positiveCount = 0;
        double negativeCount = 0;

        while (num != 0){
            if (num > 0){
                positiveCount +=1 ;
            }else {
                negativeCount +=1 ;
            }


            System.out.print("Enter Number: ");
             num = in.nextInt();

        }
        System.out.println("positiveCount: " + positiveCount);
        System.out.println("negativeCount: " + negativeCount);
    }
}

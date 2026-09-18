import java.util.Scanner;

public class do_while4 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        أكيد يا هندس، هذا سؤال جديد على do-while:

اكتب برنامج Java يطلب من المستخدم إدخال كلمة مرور.

String correctPassword = "java123";

المطلوب:

* استخدم حلقة do-while.
* أعطِ المستخدم 3 محاولات فقط.
* في كل محاولة اطلب منه إدخال كلمة المرور.
* إذا كانت كلمة المرور صحيحة، اطبع:

Access Granted

ثم أوقف الحلقة.

* إذا كانت كلمة المرور خاطئة، اطبع:

Wrong Password

* إذا انتهت المحاولات الثلاث دون إدخال كلمة المرور الصحيحة، اطبع:

Account Locked

مثال للتشغيل:

Enter password: hello
Wrong Password
Enter password: 1234
Wrong Password
Enter password: java123
Access Granted

ملاحظة: لمقارنة النصوص في Java استخدم:

password.equals(correctPassword)

ولا تستخدم:

password == correctPassword
         */
        String correctPassword = "deaa123";
        String pass;
        int count = 0;
        do {
             System.out.print("Enter Password: ");
              pass = in.nextLine();
            count++;

              if (pass.equals(correctPassword)){
                  System.out.println("Access Granted");
                  break;
              }else
                  System.out.println("Wrong Password");




        } while (count < 3);

            if (!pass.equals(correctPassword)){
            System.out.println("Account Locked");

             }
        in.close();

    }
}

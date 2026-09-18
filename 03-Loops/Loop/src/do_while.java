import java.util.Scanner;

public class do_while {
    static void main(String[] args) {
        /*

اكتب برنامج Java يطلب من المستخدم إدخال كلمة المرور.

كلمة المرور الصحيحة هي:

int correctPassword = 1234;

المطلوب:

* استخدم حلقة do-while.
* اطلب من المستخدم إدخال كلمة المرور مرة واحدة على الأقل.
* إذا كانت كلمة المرور غير صحيحة، اطبع:

Wrong Password

* استمر في طلب كلمة المرور حتى يُدخل المستخدم 1234.
* عندما يُدخل كلمة المرور الصحيحة، اطبع:

Login Successful

مثال للتشغيل:

Enter password: 5555
Wrong Password
Enter password: 1111
Wrong Password
Enter password: 1234
Login Successful
         */
        Scanner in = new Scanner(System.in);
        int correctPassword = 1234;
        int pass = 0;
        do {
            System.out.print("Enter Password: ");
             pass = in.nextInt();
             if (correctPassword != pass ){
                 System.out.println("Wrong Password");
             }
        }while (correctPassword != pass );

        if (correctPassword == pass){

            System.out.println("Login Successful");
        }


    }
}

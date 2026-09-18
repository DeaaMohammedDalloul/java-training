import java.util.Scanner;

public class do_while5 {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        /*
        أكيد يا هندس، هذا السؤال الشامل والأخير على do-while:

🏧 نظام الصرّاف الآلي

اكتب برنامج Java يحاكي نظام صرّاف آلي بسيط.

في بداية البرنامج:

double balance = 1000;
int correctPin = 1234;

أولًا: تسجيل الدخول

* استخدم حلقة do-while.
* اطلب من المستخدم إدخال الرقم السري.
* أعطِ المستخدم 3 محاولات فقط.
* إذا كان الرقم السري خطأ، اطبع:

Wrong PIN

* إذا انتهت المحاولات الثلاث، اطبع:

Card Blocked

ثم أنهِ البرنامج.

* إذا كان الرقم السري صحيحًا، اطبع:

Login Successful

ثانيًا: قائمة العمليات

بعد تسجيل الدخول بنجاح، اعرض القائمة التالية باستخدام حلقة do-while:

===== ATM Menu =====
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Enter choice:

العمليات المطلوبة

1. Check Balance

اطبع الرصيد الحالي:

Current Balance: 1000.0

2. Deposit

* اطلب من المستخدم إدخال مبلغ الإيداع.
* إذا كان المبلغ أكبر من 0، أضفه إلى الرصيد واطبع:

Deposit Successful

* غير ذلك اطبع:

Invalid Amount

3. Withdraw

* اطلب مبلغ السحب.
* إذا كان المبلغ يساوي 0 أو أقل، اطبع:

Invalid Amount

* إذا كان المبلغ أكبر من الرصيد، اطبع:

Insufficient Balance

* غير ذلك، اطرح المبلغ من الرصيد واطبع:

Withdrawal Successful

4. Exit

اطبع:

Thank You

ثم أوقف الحلقة.

إذا أدخل المستخدم اختيارًا غير الأرقام من 1 إلى 4، اطبع:

Invalid Choice

استمر في عرض القائمة حتى يختار المستخدم الرقم 4.

حاول حله بنفسك، وأرسل لي الكود حتى أصححه لك.
         */
        double balance = 1000;
        int correctPin = 1234;
        int pass;
        int count = 0;

        do {
            System.out.print("Enter Password: ");
            pass = in.nextInt();
            ++count;
            if (pass != correctPin){
                System.out.println("Wrong PIN");
            }else {
                System.out.println("Login Successful");
                int cho;
                do {
                    System.out.println("===== ATM Menu =====");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.print("Enter choice:");
                    cho = in.nextInt();
                    switch (cho){
                        case 1:
                            System.out.println("Current Balance: " + balance);
                            break;
                        case 2:
                            System.out.print("Enter deposit amount: ");
                            double amount = in.nextDouble();
                            if (amount > 0){
                                balance += amount;
                                System.out.println("Deposit Successful");
                            }else{
                                System.out.println("Invalid Amount");
                            }
                            break;
                        case 3:
                            System.out.print("Enter withdrawal amount: ");
                            double towamount= in.nextDouble();

                            if (towamount <= 0){
                                System.out.println("Invalid Amount");
                            }else if (towamount > balance){
                                System.out.println("Insufficient Balance");
                            }else if (towamount <= balance){
                                balance -= towamount;
                                System.out.println("Withdrawal Successful");
                            }
                            break;
                        case 4:
                            System.out.println("Thank You");
                            break;
                        default:
                            System.out.println("Invalid Choice");


                    }

                }while (cho != 4);
            }


        }while (count < 3);

        if (pass != correctPin){
            System.out.println("Card Blocked");
        }
        in.close();

    }
}
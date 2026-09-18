import java.util.Scanner;

public class loop_while5 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        تمام، خذ واحد مختلف وأصعب شوي:

🟢 سؤال while — سحب من الرصيد

اكتب برنامج Java يحتوي على رصيد ابتدائي:

double balance = 500;

يطلب البرنامج من المستخدم إدخال مبلغ يريد سحبه.

المطلوب:

* استخدم while.
* إذا أدخل المستخدم مبلغًا أكبر من الرصيد، اطبع:

Insufficient Balance

ثم اطلب منه إدخال المبلغ مرة أخرى.

* إذا أدخل مبلغًا يساوي 0 أو أقل، اطبع:

Invalid Amount

ثم اطلب منه مرة أخرى.

* استمر حتى يدخل مبلغًا أكبر من 0 وأقل من أو يساوي الرصيد.
* عند إدخال مبلغ صحيح:
    * اطرح المبلغ من الرصيد.
    * اطبع:

Withdrawal Successful
Remaining Balance: 300.0

شرط: استخدم while و if / else فقط، بدون for وبدون do-while.

هذا فيه شوية تفكير 👀 حلّه وابعتلي الكود أصححه لك.
         */
        double balance = 500;
        System.out.print("Enter balance: ");
        double bal = in.nextDouble();

        while (bal > balance || bal <= 0){

            if (bal > balance) {
                System.out.println("Insufficient Balance");
            }else {
                System.out.println("Invalid Amount");

            }
            System.out.print("Enter balance: ");
            bal = in.nextDouble();


        }
        balance -= bal ;
        System.out.println(balance);




    }
}

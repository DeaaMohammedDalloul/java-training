import java.util.Scanner;

public class loop_while4 {
    static void main(String[] args) {
        /*

اكتب برنامج Java يطلب من المستخدم إدخال رقم موجب.

* إذا أدخل المستخدم رقمًا يساوي 0 أو رقمًا سالبًا، اطبع:
    Invalid Number
* ثم اطلب منه إدخال الرقم مرة أخرى.
* استمر باستخدام while حتى يُدخل المستخدم رقمًا أكبر من 0.
* عندما يُدخل رقمًا صحيحًا، اطبع:
    Valid Number

مثال:

Enter number: -5
Invalid Number
Enter number: -2
Invalid Number
Enter number: 0
Invalid Number
Enter number: 8
Valid Number

حلّه وابعتلي الكود.
         */
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        while (num <= 0){
            System.out.println("Invalid Number");
            System.out.print("Enter number: ");
            num = in.nextInt();
        }
        System.out.println("Valid Number ");
in.close();
    }
}

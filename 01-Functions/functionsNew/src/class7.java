import java.util.Scanner;

public class class7 {
    /*
    المثال الثامن — حساب المضروب Factorial

أنشئ دالة:

public static long factorial(int number)

المطلوب:

* تستقبل عددًا صحيحًا موجبًا.
* تستخدم حلقة لحساب المضروب.
* تعيد النتيجة إلى main.

مثال:

Enter number: 5
Factorial = 120

لأن:

5! = 5 × 4 × 3 × 2 × 1

إذا أدخل المستخدم عددًا سالبًا، اطبع:

Invalid number

     */
    public static long factorial(long num){
        int powr = 1;
        for (int i = 1 ; i <= num ; i++){
            powr *= i ;
        }
        return powr;
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = in.nextInt();
        if (num < 0){
            System.out.println("Invalid number");

        }else  System.out.println(factorial(num));

in.close();

    }
}

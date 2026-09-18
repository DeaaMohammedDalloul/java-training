import java.util.Scanner;

public class class6 {
    /*
    لمثال السابع — حساب القوة بدون Math.pow

أنشئ دالة:

public static int calculatePower(int base, int exponent)

المطلوب:

* تستقبل الأساس والأس.
* تحسب النتيجة باستخدام حلقة for.
* لا تستخدم Math.pow().
* أعد النتيجة إلى main.

مثال:

Enter base: 2
Enter exponent: 4
Result = 16

افترض أن الأس يساوي صفرًا أو عددًا موجبًا.

     */
    public static int calculatePower(int base, int exp){
        int x = 1;
        for (int i = 1; i <= exp ; i++){
            x *=  base ;
        }
        return x;
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int exp = input.nextInt();
        int x = calculatePower(base , exp);
        System.out.println(x);

        input.close();
    }
}

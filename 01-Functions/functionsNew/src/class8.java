import java.util.Scanner;

public class class8 {
    /*

السؤال الشامل — نظام تحليل عدد

اكتب برنامج Java يطلب من المستخدم إدخال عدد صحيح، ثم يعرض القائمة:

===== Number Analyzer =====
1. Check Even or Odd
2. Check Positive, Negative or Zero
3. Calculate Square
4. Calculate Factorial
5. Print Multiplication Table
6. Exit
Enter choice:

أنشئ الدوال التالية:

public static boolean isEven(int number)
public static String checkSign(int number)
public static int calculateSquare(int number)
public static long factorial(int number)
public static void printTable(int number)

التعليمات:

* استخدم do-while لإعادة عرض القائمة حتى يختار المستخدم 6.
* استخدم switch لاستدعاء الدالة المناسبة.
* لا تستخدم مصفوفات.
* في المضروب، امنع الأعداد السالبة.
* دالة printTable تطبع جدول ضرب العدد من 1 إلى 10.
* عند إدخال اختيار غير موجود، اطبع:

Invalid choice
     */

    public static boolean isEven(int number){
        return number % 2 == 0;

    }
    public static String checkSign(int number){
        if (number > 0){
            return  "Positive";
        } else if (number < 0) {
            return  "Negative";

        }else {
            return " Zero";
        }

    }
    public static int calculateSquare(int number){

        return number * number ;
    }

    public static long factorial(int number){
        // يجب اضافة خيار مضروب الصفر يساوي 1
        long powr = 1;
        for (int i = 1 ; i <= number ; i++){
            powr *= i ;
        }
        return powr;
     }

    public static void printTable(int number){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(i + " * " + number + " = " + (i * number));
        }
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = in.nextInt();
        int cho;
        do {

            System.out.println("===== Number Analyzer =====");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Check Positive, Negative or Zero");
            System.out.println("3. Calculate Square");
            System.out.println("4. Calculate Factorial");
            System.out.println("5. Print Multiplication Table");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            cho = in.nextInt();


            switch (cho){
                case 1:
                    if (isEven(number)){
                        System.out.println("The number is even");

                    }else System.out.println("The number in odd");
                    break;
                case 2:
                    System.out.println(checkSign(number));
                    break;
                case 3:
                    System.out.println( "Square = " + calculateSquare(number));
                    break;
                case 4:
                    if (number <0 ){
                        System.out.println("Invalid number");

                    }else System.out.println(factorial(number));
                    break;
                case 5:
                    printTable(number);
                    break;
                case 6:
                    System.out.println("Program closed");
                    break;
                default:
                    System.out.println("rInvalid choice");
            }

        }while (cho != 6);
        in.close();

    }
}

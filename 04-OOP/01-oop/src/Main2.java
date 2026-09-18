import java.util.Scanner;

public class Main2 {

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number Cars: ");
        Car [] c2 = new Car[in.nextInt()];

        for (int i =0 ; i < c2.length ; i++){
            c2[i] = new Car();
            System.out.print("Enter name brand "+(i+1)+" : ");
            in.nextLine();
             c2[i].brand =in.nextLine();
        System.out.print("Enter color brand: ");
            c2[i].color = in.nextLine();
        System.out.print("Enter year brand: ");
            c2[i].year = in.nextInt();
        System.out.print("Enter price brand: ");
        in.nextLine();
           c2[i].price = in.nextDouble();

            double priceAfterTax =  c2[i].price + ( c2[i].price * 0.10);

        System.out.println("\n============================================\n");
                  c2[i].printcar();
        System.out.println("Price after tax: "+ priceAfterTax);
        System.out.println("\n============================================\n");




        }


//        Car c1 = new Car();
//
//        System.out.print("Enter name brand: ");
//        c1.brand =in.nextLine();
//        System.out.print("Enter color brand: ");
//        c1.color = in.nextLine();
//        System.out.print("Enter year brand: ");
//        c1.year = in.nextInt();
//        System.out.print("Enter price brand: ");
//        c1.price = in.nextDouble();
//        System.out.println("\n============================================\n");
//        double priceAfterTax = c1.price + (c1.price * 0.10);
//        c1.printcar();
//        System.out.println("Price after tax: "+ priceAfterTax);


    }
    /*

السؤال الأول — بيانات سيارة

أنشئ class اسمه:

Car

وضع داخله المتغيرات التالية:

String brand;
String color;
int year;
double price;

ثم داخل main:

1. أنشئ Object اسمه car1.
2. خزّن فيه البيانات التالية:
    * الماركة: "BMW"
    * اللون: "Black"
    * السنة: 2022
    * السعر: 45000
3. اطبع جميع بيانات السيارة.
4. احسب سعر السيارة بعد إضافة ضريبة مقدارها 10%.
5. اطبع السعر بعد الضريبة.

يجب أن يكون الإخراج قريبًا من:

Brand: BMW
Color: Black
Year: 2022
Price: 45000.0
Price after tax: 49500.0

تلميح حساب الضريبة:

double priceAfterTax = car1.price + (car1.price * 0.10);

حلّه وأرسله لي، وسأراجع الكود معك، وبعدها أعطيك سؤالًا ثانيًا أصعب بدرجة صغيرة.
     */
}

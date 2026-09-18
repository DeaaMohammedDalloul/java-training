import java.util.Scanner;

public class Main {
/*
أكيد يا هندس، هذا سؤال وراثة أصعب بدرجة بسيطة:

سؤال — نظام السيارات

أنشئ كلاس أب اسمه Vehicle يحتوي على:

private String brand;
private int year;

المطلوب داخله:

* Constructor يستقبل brand وyear.
* كتابة get وset.
* دالة لعرض بيانات المركبة:

public void displayVehicle()

⸻

أنشئ كلاس ابن اسمه Car يرث من Vehicle:

public class Car extends Vehicle

ويحتوي على:

private String model;
private double price;

المطلوب داخله:

* Constructor يستقبل جميع البيانات:

brand, year, model, price

* استخدم super لإرسال brand وyear إلى Constructor الأب.
* كتابة get وset للخصائص الجديدة.
* منع السعر من أن يكون سالبًا.
* دالة:

public void displayCar()

    تستدعي displayVehicle() ثم تطبع model وprice.

⸻

داخل Main:

* أنشئ سيارتين.
* اطبع بيانات السيارتين باستخدام displayCar().

مثال:

Car car1 = new Car("Toyota", 2022, "Corolla", 20000);
Car car2 = new Car("BMW", 2024, "X5", 65000);

الناتج المتوقع:

Brand: Toyota
Year: 2022
Model: Corolla
Price: 20000.0
Brand: BMW
Year: 2024
Model: X5
Price: 65000.0

اكتب الحل في ثلاثة ملفات:

Vehicle.java
Car.java
Main.java
 */
static void main(String[] args) {

//    Car car1 = new Car("Toyota", 2022, "Corolla", 20000);
//    Car car2 = new Car("BMW", 2024, "X5", 65000);
//
//    car1.printCar();
//    System.out.println("_____________________________");
//    car2.printCar();
//
//}




    Scanner in = new Scanner(System.in);
    System.out.print("Enter number Car: ");
    int num = in.nextInt();
    Car car1[] = new Car[num];
    in.nextLine();

//    Vehicle veh1[] = new Vehicle[num];

    for (int i = 0 ; i < car1.length ; ++i){
        System.out.print("Enter brand ("+(i+1)+"): ");
        String brand = in.nextLine();
        System.out.print("Enter year: ");
        int year = in.nextInt();
        System.out.print("Enter model: ");
        in.nextLine();
        String model = in.nextLine();
        System.out.print("Enter price: ");
        double price = in.nextDouble();


        car1[i]=new Car((String)brand , year ,(String) model , price);
//        veh1[i] = new Vehicle((String)brand , year );

    }

    for (int i = 0 ; i < car1.length ; ++i){
        System.out.println("________________________");
        car1[i].printCar();
//        System.out.println("_________________________");
    }


  }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    /*
    السؤال الأول — منتج

    أنشئ class اسمه Product يحتوي على:

    private String name;
    private double price;
    private int quantity;

    المطلوب:

    * إنشاء constructor.
    * كتابة get وset.
    * منع السعر والكمية من أن يكونا سالبين.
    * دالة تحسب القيمة الإجمالية:

    public double getTotalPrice()

    بحيث:

    total = price × quantity

    * دالة displayInfo() تطبع جميع بيانات المنتج.

    جرّب إنشاء منتجين داخل main.

     */
        Scanner in = new Scanner(System.in);
        Product[]p3 = new Product[2];

        for (int i = 0 ; i < p3.length  ; ++i){
            System.out.print("Enter yuor name "+(i+1)+ ": ");
            String user_name = in.nextLine();
            System.out.print("Enter price: ");
            double user_price = in.nextDouble();
            System.out.print("Enter quantity: ");
             int user_quantity = in.nextInt();
            in.nextLine();

            p3[i]= new Product(user_name,user_price,user_quantity);


        }
        for (int i =0 ; i < p3.length ; ++i){
            System.out.println("__________________________");
            System.out.println("Product number "+(i+1));
            p3[i].printfull();
        }
        in.close();


 //             Product p1 = new Product(user_name, user_price, user_quantity);
//            Product p2 = new Product("ahmed", 10, 10);
//              p1.printfull();
//               System.out.println("________________________");
//             p1.printfull();


//        System.out.print("Enter yuor name: ");
//        String user_name = in.nextLine();
//        System.out.print("Enter price: ");
//        double user_price = in.nextDouble();
//        System.out.print("Enter quantity: ");
//        int user_quantity = in.nextInt();
//    Product p1 = new Product(user_name, user_price, user_quantity);
//    Product p2 = new Product("ahmed", 10, 10);
//
// System.out.println(p1.getTotalPrice());
//    System.out.println(p2.getTotalPrice());
//
//
//  p1.printfull();
//    System.out.println("________________________");
//p2.printfull();


    }

}
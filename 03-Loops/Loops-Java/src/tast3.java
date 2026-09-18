import java.util.Scanner;

public class tast3 {
    /*

احسب السعر الإجمالي.

ثم طبّق الخصومات التالية:
إذا كان السعر 500 أو أكثر → خصم 20%.
إذا كان السعر من 300 إلى أقل من 500 → خصم 15%.
إذا كان السعر من 150 إلى أقل من 300 → خصم 10%.
إذا كان أقل من 150 → لا يوجد خصم.

خصم إضافي:
إذا كان العمر أقل من 18 سنة → خصم إضافي 5%.

وفي النهاية اطبع:
اسم الزبون.
العمر.
عدد القطع.
السعر قبل الخصم.
قيمة الخصم.
السعر النهائي.

     */
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        System.out.print("Enter Your Age: ");
        int age = in.nextInt();
        System.out.print("Enter the number of products you bought: ");
        int num = in.nextInt();

        double total = 0;

        for ( int i = 1 ; i <= num ; ++i ){

            System.out.println("1: T-Shirt = (30)");
            System.out.println("2: Jeans = (60)");
            System.out.println("3: Jacket = (100)");
            System.out.println("4: Shoes = (120)");
            int x = in.nextInt();

            int dee = 0;
            String product = "";
            switch (x){


                case 1:
                    product = " T-Shirt";
                    dee = 30 ;
                    break;
                case 2:
                    product = "Jeans ";
                    dee = 60;
                    break;
                case 3:
                    product = "Jacket";
                     dee = 100;
                    break;
                case 4:
                    product= "Shoes";
                     dee = 120;
                    break;
                default:
                    System.out.println("the Enter Error");
                    System.exit(0);


            }

            System.out.println(" the product price "+ i + " = " + dee);

            total += dee;


        }
        System.out.println( "total: " +total);
        /*
        :
إذا كان السعر 500 أو أكثر → خصم 20%.
إذا كان السعر من 300 إلى أقل من 500 → خصم 15%.
إذا كان السعر من 150 إلى أقل من 300 → خصم 10%.
إذا كان أقل من 150 → لا يوجد خصم.
:
إذا كان العمر أقل من 18 سنة → خصم إضافي 5%.

وفي النهاية اطبع:
اسم الزبون.
العمر.
عدد القطع.
السعر قبل الخصم.
قيمة الخصم.
السعر النهائي.

         */
        double fee = 0;

        if(total >= 500){
            fee = 0.2;



        } else if (total >= 300 && total <500) {
            fee = 0.15;


        } else if (total >= 150 && total < 300) {
            fee = 0.1;


        }else {
            fee = 0;

        }
        if (age < 18 ){
            fee += 0.05;
            
        }


    }
}

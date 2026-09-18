

import java.util.Scanner;
public class functionsString2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        اكتب برنامجًا يطلب من المستخدم إدخال كلمة، ثم:

* يتأكد أنها ليست فارغة باستخدام isEmpty().
* يطبع عدد حروفها باستخدام length().
* يطبع أول حرف وآخر حرف باستخدام charAt().
* يحولها إلى أحرف كبيرة وصغيرة.
* يتحقق هل تحتوي على كلمة "Java".
* يعرض قائمة باستخدام do-while وswitch
         */
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        int cho;

        do {

            System.out.println("اختر اي اجراء تريد تنفيذه: ");
            System.out.println("1: يتأكد أنها ليست فارغة");
            System.out.println("2: يطبع عدد حروفها");
            System.out.println("3: يطبع أول حرف ");
            System.out.println("4: يطبع آخر حرف");
            System.out.println("5:  يحولها إلى أحرف كبيرة");
            System.out.println("6: يحولها إلى أحرف صغيرة");
            System.out.println("7: يتحقق هل تحتوي على كلمة (Java)");
            System.out.println("8: Exit ");
            System.out.print("Enter choice: ");
             cho = in.nextInt();

            switch (cho){
                case 1:
                    System.out.println(name.isEmpty());
                    break;
                case 2:
                    System.out.println(name.length());
                    break;
                case 3:
                    System.out.println(name.charAt(0));
                    break;
                case 4:
                    System.out.println(name.charAt(name.length()-1));
                    break;
                case 5:
                    System.out.println(name.toUpperCase());
                    break;
                case 6:
                    System.out.println(name.toLowerCase());
                    break;
                case 7:
                    System.out.println(name.contains("Java"));
                break;
                case 8:
                    System.out.println("خروج من البرنامج ");
                    break;
                default:
                    System.out.println("Enter Error");

            }

        } while (cho != 8);
        in.close();

    }
}

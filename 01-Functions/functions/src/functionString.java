import java.util.Locale;
import java.util.Scanner;

public class functionString {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// هذه الدالة عن تحديد طول النص (String) و اضافة شرط طول معين

        System.out.print("The name of the university: ");
        String nameuni = in.nextLine();
        System.out.println(nameuni.length());

        if (nameuni.length() < 8){
            System.out.println("the name is correct ");

        }

// هذه الدالة عن تحديد طول النص (String)

        System.out.print("Enter password: ");
        String pass = in.nextLine();
        System.out.println(pass.length());

 // هذه الدالة لمقارنة نصين (String) شبه بعض بزبط

        System.out.print("Enter Name: ");
        String name  = in.nextLine();
        System.out.println(pass.equals("deaa"));


// هذه احد الدالة عن مقارنة النصوص (String) دون الاهتمام بحالة الاحرف (كبيرة او صغيرة )

        System.out.print("The name of the university: ");
        String uni = in.nextLine();

        if (uni.equalsIgnoreCase("Alazher") || uni.equalsIgnoreCase("Alazher Universty")){
            System.out.println("Deaa very happy");
        }


        // هذه احد الدالة التي تاخذ طول معين من النصوص (String)

        System.out.print("The name of the university: ");
        String un2 = in.nextLine();

        System.out.println(un2.substring(0,7));


        // هذه احد الدالة التي تحول الاحرف الكبيرة الى احرف صغيرة في النصوص (String)

        System.out.print("ُEnter Email: ");
        String email = in.nextLine();

        System.out.println(email.toLowerCase());


        // هذه احد الدالة التي تحول الاحرف الصغيرة الى احرف كبيرة في النصوص (String)

        System.out.print("ُEnter Email: ");
        String emailtow = in.nextLine();

        System.out.println(email.toLowerCase(Locale.ROOT));



    }

}
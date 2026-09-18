import java.util.Scanner;

public class functionMath {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number one: ");
        double num = in.nextDouble();

        System.out.print("Enter Number tow: ");
        double num2 = in.nextDouble();

        //هذه واحدة دوال Math التي تقوم بحساب القيمة المطلقة (اي ان العدد السالب يصبح موجب)
        System.out.println(Math.abs(num));

        //  هذه واحدة دوال Math التي تقوم بحساب الجذر التربيعي (ناتج الرقم السالب NaN )
        System.out.println(Math.sqrt(num));

        //هذه واحدة دوال Math التي تقوم برفع العدد الى الاقوى
        System.out.println(Math.pow(num, 2));

        //هذه واحدة دوال Math التي تظهر العدد الاكبر
        System.out.println(Math.max(num, num2));

        //هذه واحدة دوال Math التي تظهر العدد الاصغر
        System.out.println(Math.min(num, num2));

        // هذه واحدة دوال Math التي تقرب العدد لاقرب عدد صحيح (اذا اقل من 0.5 يقرب لاسفل و العكس صحيح )
        System.out.println(Math.round(num));

        // هذه واحدة دوال Math التي تقرب لاعلى ( حتى لو كان العدد العشري اقل من النص )
        System.out.println(Math.ceil(num));

        //هذه واحدة دوال Math التي تقرب لاسفل (حتى لو كان العدد العشري اكثر من النص )
        System.out.println(Math.floor(num));


        System.out.println("Absolute = " + Math.abs(-7));
        System.out.println("Square root = " + Math.sqrt(25));
        System.out.println("Power = " + Math.pow(2, 3));
        System.out.println("Maximum = " + Math.max(5, 9));
        System.out.println("Minimum = " + Math.min(5, 9));
        System.out.println("Round = " + Math.round(5.6));
        System.out.println("Ceil = " + Math.ceil(5.2));
        System.out.println("Floor = " + Math.floor(5.9));

        int randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println("Random number = " + randomNumber);
    }
}




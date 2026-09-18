import java.util.Scanner;

public class Main {
    /*
    السؤال الخامس — نظام طلاب شامل

أنشئ class اسمه Student يحتوي على:

private String name;
private int id;
private double mark;

وفي Main:

* أنشئ مصفوفة تحتوي على 5 طلاب:

Student[] students = new Student[5];

* اطلب بياناتهم من المستخدم.
* خزّن كل طالب ككائن داخل المصفوفة.
* اطبع بيانات الطلاب.
* احسب متوسط الدرجات.
* اعرض اسم الطالب صاحب أعلى درجة.
* احسب عدد الناجحين والراسبين.
* الطالب ناجح إذا كانت درجته 50 أو أكثر.

     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Student:  ");
        Student [] stu = new Student[input.nextInt()];
        input.nextLine();

        for (int i = 0 ; i < stu.length ; i++){
            System.out.print("Enter Your Name "+(i+1)+ ": ");
            String name =input.nextLine();
            System.out.print("Enter your Id: ");
            int id = input.nextInt();
            System.out.print("Enter mark: ");
            double mark = input.nextDouble();
            input.nextLine();

            stu[i] = new Student(name , id , mark );

        }
//        هذه هي for esch و تستخدم فقط للمصفوفات
//        for (Student s : stu){
//            s.printfull();
//        }

        for (int i = 0 ; i < stu.length ; ++i){
            System.out.println("____________________________");
            stu[i].printfull();
            System.out.println("____________________________");
        }

        double totalmark = 0;
       int passCount = 0 ;
       int Fail = 0;

       Student topmark = stu[0];
        for (int i = 0 ; i < stu.length ; ++i){
            totalmark += stu[i].getMark();
            if ( stu[i].getMark() >= 50){
                passCount++;

            }else {
                Fail++;
            }
           if (stu[i].getMark() > topmark.getMark()){
               topmark = stu[i];
           }
        }

        double average = totalmark / stu.length ;
       System.out.println("Highest student: " + topmark.getName());
       System.out.println("Highest mark: " + topmark.getMark());
       System.out.println("average: "+ average);
       System.out.println("pass Count: "+ passCount);
       System.out.println("Fail: "+ Fail);


    }

}
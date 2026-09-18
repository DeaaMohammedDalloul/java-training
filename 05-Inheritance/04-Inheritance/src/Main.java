import java.util.Scanner;

public class Main {
    /*
السؤال — نظام موظفين

أنشئ class أب اسمه Employee يحتوي على:

private String name;
private int id;
private double salary;

أضف إليه:

* constructor لاستقبال البيانات.
* دوال get وset.
* دالة displayInfo() تطبع بيانات الموظف.
* دالة calculateBonus() ترجع قيمة المكافأة، وتكون في Employee تساوي:

salary * 0.05

ثم أنشئ class ابن اسمه Manager يرث من Employee، ويحتوي على:

private String department;

المطلوب داخل Manager:

* إنشاء constructor واستخدام super.
* كتابة get وset للقسم.
* عمل Override للدالة calculateBonus()، بحيث تكون مكافأة المدير:

salary * 0.15

* عمل Override للدالة displayInfo() لطباعة بيانات الموظف بالإضافة إلى القسم.

داخل Main:

1. اطلب من المستخدم بيانات مدير.
2. أنشئ كائنًا من Manager.
3. اطبع جميع بياناته.
4. اطبع قيمة مكافأته.
5. اطبع راتبه النهائي بعد إضافة المكافأة.

مثال للنتيجة:

Name: Deaa
ID: 1001
Salary: 2000.0
Department: IT
Bonus: 300.0
Final Salary: 2300.0

     */
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Id: ");
        int id = in.nextInt();
        System.out.print("Enter Salary: ");
        double salary = in.nextDouble();
        in.nextLine();
        System.out.print("Enter department: ");
        String dep = in.nextLine();

        Manager Emp1 = new Manager(name , id , salary ,dep);

        System.out.println("============= Manager Information ==========");
        Emp1.printManager();

    }

}
public class Main {
    /*
    تمرينك الأول في الوراثة

أنشئ كلاس Employee يرث من Person.

يحتوي Person على:

private String name;
private int age;

ويحتوي Employee على:

private int employeeId;
private double salary;

المطلوب:

* إنشاء constructor داخل Person.
* إنشاء constructor داخل Employee.
* استخدام extends.
* استخدام super.
* إنشاء دالة displayPerson() في الأب.
* إنشاء دالة displayEmployee() في الابن.
* إنشاء موظف داخل Main وطباعة بياناته.

مثال بيانات:

Employee employee =
        new Employee("Deaa", 22, 1001, 1500);

     */
    static void main(String[] args) {

        Employee emp = new Employee("deaa" , 22 , 2004 , 1000 );
//        System.out.println( "Name: " + emp.getName());
//        System.out.println("Aga: " + emp.getAge());

//        emp.displayPerson();
        emp.displayEmployee();


    }
}
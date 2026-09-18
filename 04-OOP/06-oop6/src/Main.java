public class Main {
    /*
    السؤال الثالث — سيارة

أنشئ class اسمه Car يحتوي على:

private String brand;
private String model;
private int speed;

والدوال:

public void accelerate(int amount)
public void brake(int amount)
public void displayInfo()

الشروط:

* accelerate تزيد السرعة.
* brake تقلل السرعة.
* السرعة لا يمكن أن تصبح أقل من صفر.
* السرعة القصوى 200.
* جرّب إنشاء سيارتين؛ كل سيارة لها سرعة مستقلة.

     */
    static void main(String[] args) {
        Car car1 = new Car("Toyota" , "Corolla" , (50));
        Car car2 = new Car("BMW" ,"M4" , 80);

        car1.accelerate(30);
        car1.brake(20);

        car2.accelerate(150);
        car2.brake(50);

        car1.displayInfo();
        car2.displayInfo();

    }


}
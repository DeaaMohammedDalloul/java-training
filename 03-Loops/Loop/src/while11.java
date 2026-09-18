import java.util.Random;
import java.util.Scanner;

public class while11 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*


اكتب برنامج Java يحتوي على رقم صحيح مخفي:

int secretNumber = 7;

المستخدم لديه 5 محاولات فقط لتخمين الرقم.

المطلوب:

* استخدم while.
* أنشئ متغيرًا لحساب عدد المحاولات.
* في كل محاولة، اطلب من المستخدم إدخال رقم.
* إذا كان الرقم يساوي الرقم المخفي، اطبع:

Correct Guess

وتنتهي الحلقة.

* إذا كان الرقم أكبر من الرقم المخفي، اطبع:

Too High

* إذا كان الرقم أصغر من الرقم المخفي، اطبع:

Too Low

* إذا انتهت المحاولات الخمس دون تخمين الرقم، اطبع:

Game Over

/*
/*

         */
        Random out = new Random();
        int snum = out.nextInt(30);

        int cont = 0;
        int num = 0;


        while (cont < 5 && num != snum ){
            System.out.print("Enter Number: ");
            num = in.nextInt();
            if (num > snum){
                System.out.println("Too High");
            }else if (num < snum){
                System.out.println("Too Low");

            }
            cont++;

        }
        if (cont >= 5){
        }

        if (num == snum){
            System.out.println("Correct Guess");
        }else {
            System.out.println("Game Over");
            System.out.println("The number was: " + snum);


        }

    }
}

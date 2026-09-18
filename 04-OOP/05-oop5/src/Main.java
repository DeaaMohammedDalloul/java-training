import java.util.Scanner;

public class Main {
    /*

السؤال الثاني — حساب بنكي

أنشئ class اسمه BankAccount يحتوي على:

private String ownerName;
private int accountNumber;
private double balance;

أضف:

public void deposit(double amount)
public void withdraw(double amount)
public void displayAccount()

الشروط:

* لا تقبل إيداع مبلغ يساوي صفرًا أو سالبًا.
* لا تسمح بسحب مبلغ أكبر من الرصيد.
* لا تسمح بسحب مبلغ سالب.
* استخدم get لمعرفة الرصيد، ولا تعدّل الرصيد مباشرة من main.

مثال:

BankAccount account =
        new BankAccount("Deaa", 1001, 1000);
account.deposit(500);
account.withdraw(300);
account.displayAccount();

     */
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter account Number: ");
        int number = in.nextInt();
        System.out.print("Enter balance bank: ");
        double balance = in.nextDouble();
        System.out.println("1: withdrawal amount");
        System.out.println("2: addition amount ");
        System.out.print("Enter choose: ");
        BankAccount Acc1 = new BankAccount(name , number , balance);

        int cho = in.nextInt();
        switch (cho){
            case 1:
                System.out.print("Enter amount: ");
                double withdrawal = in.nextDouble();
                System.out.println("the balance after: "  +Acc1.withdrawal(withdrawal));
                break;
            case 2:
                System.out.print("Enter amount: ");
                double deposit = in.nextDouble();
                System.out.println("the balance after: " + Acc1.deposit(deposit));
                break;
            default:
                System.out.println("Enter Error");

        }
               in.close();

    }

}
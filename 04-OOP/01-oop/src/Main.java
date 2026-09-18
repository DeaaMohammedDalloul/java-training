import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

/*
        Person p1 = new Person();

        System.out.print("Enter name: ");jh
        p1.name = in.nextLine();

        System.out.print("Enter email: ");
        p1.email = in.nextLine();

        System.out.print("Enter Age: ");
        p1.age = in.nextInt();

        p1.personprint();

 */
        System.out.print("Enter Number People: ");
        Person [] uesr = new Person[in.nextInt()];

        for (int i = 0 ; i < uesr.length ; ++i){
            uesr[i]=new Person();

            System.out.print("Enter name: ");
            in.nextLine();
            uesr[i].name = in.nextLine();


            System.out.print("Enter email: ");
            uesr[i].email = in.nextLine();

            System.out.print("Enter Age: ");
            uesr[i].age = in.nextInt();

        }
        for (int i = 0 ; i < uesr.length ; ++i){
            System.out.println("================================");
            uesr[i].personprint();
            System.out.println("================================");


        }

    }
}
import java.util.Scanner;

public class class1 {

  public static void printWelcome(String name){
        System.out.println("Welcom " + name );
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.nextLine();
        printWelcome(name);

    }
}
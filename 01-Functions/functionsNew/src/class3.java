import java.util.Scanner;

public class class3 {

    public static boolean isEven(int num){
        return num % 2 == 0 ? true : false ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        if (isEven(num)){
            System.out.println("Even Number ");
        }else
            System.out.println("Ddd Number ");
        in.close();
    }
}

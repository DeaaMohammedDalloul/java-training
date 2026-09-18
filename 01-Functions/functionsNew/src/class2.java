import java.util.Scanner;

public class class2 {

    public static int square(int num){

        return (int )Math.pow(num , 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.println(square(num));





    }
}

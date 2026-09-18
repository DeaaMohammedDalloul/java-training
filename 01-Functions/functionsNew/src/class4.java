import java.util.Scanner;

public class class4 {

    public static int findMax (int x , int y){

        int num ;
        if (x == y){
            num = x;

        }else
            num = Math.max(x,y);
        return num;

    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number one: ");
        int x = in.nextInt();
        System.out.print("Enter Number tow: ");
        int y = in.nextInt();
        System.out.println( "Maximum = " + findMax(x,y));

        in.close();


    }
}

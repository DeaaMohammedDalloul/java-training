import java.util.Scanner;

public class loop_while2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = in.nextByte();
        int i = 2;
         while (i <= N){
             System.out.println(i);
             i+=2;
         }
    }
}

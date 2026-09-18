import java.util.Scanner;

public class loop_while8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while (true){
            System.out.print(" Enter nark or enter 0 to stop: ");
           int mark = in.nextInt();
           if (mark == 0){
               break;
           }
            total += mark ;
            count ++;

        }

        System.out.println("AVG " + (total / count) );

    }
}

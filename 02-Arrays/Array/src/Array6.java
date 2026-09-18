import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int evenCount = 0;
        System.out.println("Even numbers:");

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
                evenCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        input.close();
    }
}

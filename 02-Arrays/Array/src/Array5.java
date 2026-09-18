import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[4];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}

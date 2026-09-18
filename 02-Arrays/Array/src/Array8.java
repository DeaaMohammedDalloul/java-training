import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int positiveSum = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            if (numbers[i] > 0) {
                positiveSum += numbers[i];
            } else if (numbers[i] == 0) {
                zeroCount++;
            }
        }

        System.out.println("Negative numbers:");
        for (int number : numbers) {
            if (number < 0) {
                System.out.println(number);
            }
        }

        System.out.println("Sum of positive numbers: " + positiveSum);
        System.out.println("Zero count: " + zeroCount);
        input.close();
    }
}

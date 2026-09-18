import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjectCount = input.nextInt();

        if (subjectCount <= 0) {
            System.out.println("The number of subjects must be positive.");
            input.close();
            return;
        }

        double[] marks = new double[subjectCount];
        double total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = input.nextDouble();
            total += marks[i];
        }

        double average = total / marks.length;
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        input.close();
    }
}

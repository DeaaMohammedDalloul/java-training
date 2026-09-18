import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentCount;

        do {
            System.out.print("Enter the number of students: ");
            studentCount = input.nextInt();

            if (studentCount <= 0) {
                System.out.println("The number of students must be positive.");
            }
        } while (studentCount <= 0);

        int[] marks = new int[studentCount];
        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];

            if (marks[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        int highestMark = marks[0];
        int lowestMark = marks[0];

        System.out.println("\nAll marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
            highestMark = Math.max(highestMark, marks[i]);
            lowestMark = Math.min(lowestMark, marks[i]);
        }

        double average = (double) sum / marks.length;
        System.out.println("\nAverage: " + average);
        System.out.println("Highest mark: " + highestMark);
        System.out.println("Lowest mark: " + lowestMark);
        System.out.println("Passed students: " + passed);
        System.out.println("Failed students: " + failed);

        input.close();
    }
}

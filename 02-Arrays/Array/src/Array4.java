import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        int sum = 0;
        int passedStudents = 0;
        int highestGrade = grades[0];
        int lowestGrade = grades[0];

        for (int grade : grades) {
            sum += grade;
            highestGrade = Math.max(highestGrade, grade);
            lowestGrade = Math.min(lowestGrade, grade);

            if (grade >= 50) {
                passedStudents++;
            }
        }

        double average = (double) sum / grades.length;

        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
        System.out.println("Passed students: " + passedStudents);

        input.close();
    }
}

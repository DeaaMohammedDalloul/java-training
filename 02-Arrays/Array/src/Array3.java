import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int personCount = input.nextInt();
        input.nextLine();

        if (personCount <= 0) {
            System.out.println("The number of people must be positive.");
            input.close();
            return;
        }

        String[] names = new String[personCount];
        int[] ages = new int[personCount];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nPeople:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }

        input.close();
    }
}

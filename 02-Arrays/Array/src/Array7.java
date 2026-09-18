public class Array7 {
    public static void main(String[] args) {
        int[][] marks = {
                {80, 70, 88, 90},
                {90, 73, 91, 95},
                {72, 83, 97, 92},
                {70, 95, 86, 70}
        };

        int diagonalSum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks:");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[i][j]);

                if (i == j) {
                    diagonalSum += marks[i][j];
                }
            }

            System.out.println("==========");
        }

        System.out.println("Main diagonal sum: " + diagonalSum);
    }
}

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] scores = new int[5][3];

        int highestScore = 0;

        for (int row = 0; row < scores.length; row++) {

            for (int col = 0; col < scores[row].length; col++) {

                System.out.print("Enter score for Student "
                        + (row + 1) + ", Course " + (col + 1) + ": ");

                scores[row][col] = input.nextInt();

                if (scores[row][col] > highestScore) {
                    highestScore = scores[row][col];
                }
            }
        }

        System.out.println("\nSTUDENT SCORES");

        System.out.printf("%-12s%10s%10s%10s%n",
                "Student", "Course 1", "Course 2", "Course 3");

        for (int row = 0; row < scores.length; row++) {

            System.out.printf("%-12s", "Student " + (row + 1));

            for (int col = 0; col < scores[row].length; col++) {

                System.out.printf("%10d", scores[row][col]);
            }

            System.out.println();
        }

        System.out.println("\nAVERAGE FOR EACH STUDENT");

        for (int row = 0; row < scores.length; row++) {

            int total = 0;

            for (int col = 0; col < scores[row].length; col++) {

                total = total + scores[row][col];
            }

            double average = total / 3.0;

            System.out.printf("Student %d: %.2f%n",
                    row + 1, average);
        }

        System.out.println("\nAVERAGE FOR EACH COURSE");

        for (int col = 0; col < scores[0].length; col++) {

            int total = 0;

            for (int row = 0; row < scores.length; row++) {

                total = total + scores[row][col];
            }

            double average = total / 5.0;

            System.out.printf("Course %d: %.2f%n",
                    col + 1, average);
        }

        System.out.println("\nHighest score in the entire array: "
                + highestScore);

        input.close();
    }
}

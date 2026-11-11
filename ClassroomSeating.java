import java.util.Scanner;

public class ClassroomSeating {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] seats = new String[4][5];

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {

                System.out.print("Enter student name for Row "
                        + (row + 1) + ", Seat " + (col + 1) + ": ");

                seats[row][col] = input.nextLine();
            }
        }

        System.out.println("\nCLASSROOM SEATING ARRANGEMENT");

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {

                System.out.printf("%-15s", seats[row][col]);
            }

            System.out.println();
        }

        System.out.print("\nEnter row number (1-4): ");
        int selectedRow = input.nextInt();

        System.out.print("Enter seat number (1-5): ");
        int selectedCol = input.nextInt();

        if (selectedRow >= 1 && selectedRow <= 4
                && selectedCol >= 1 && selectedCol <= 5) {

            System.out.println("Student seated at that position: "
                    + seats[selectedRow - 1][selectedCol - 1]);

        } else {
            System.out.println("Invalid row or seat number.");
        }

        input.close();
    }
}

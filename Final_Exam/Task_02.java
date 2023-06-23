import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int row = Integer.parseInt(dimensions[0]);
        int col = Integer.parseInt(dimensions[1]);
        String[][] field = new String[row][col];
        int myRow = -1;
        int myCol = -1;

        for (int i = 0; i < row; i++) {
            String[] rows = scanner.nextLine().split(" ");
                field[i] = rows;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (field[i][j].equals("B")) {
                    myRow = i;
                    myCol = j;
                }
            }
        }
        String command = scanner.nextLine();
        int moves = 0;
        int oponents = 0;
        boolean end = false;

        while (!command.equals("Finish")) {
            boolean isWithinField = myRow >= 0 && myRow <= field.length && myCol >= 0 && myCol <= field.length;

            switch (command) {
                case "left":
                    myRow--;
                    if (myRow < 0 && myRow > field.length || field[myRow][myCol].equals("O")) {
                        myRow++;
                    }

                    break;
                case "right":
                    myRow++;
                    if (myRow < 0 && myRow > field.length || field[myRow][myCol].equals("O")) {
                        myRow--;
                    }

                    break;
                case "down":
                    myCol++;
                    if (myCol < 0 && myCol > field.length || field[myRow][myCol].equals("O")) {
                        myCol--;
                    }

                    break;
                case "up":
                    myCol--;
                    if (myCol < 0 && myCol > field.length || field[myRow][myCol].equals("O")) {
                        myCol++;
                    }

                    break;
            }
            if (field[myRow][myCol].equals("-")) {
                moves++;
            } else if (field[myRow][myCol].equals("P")) {
                moves++;
                oponents++;
                field[myRow][myCol] = "-";
            }
            if (oponents == 3) {
                return;
            }
        }
        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d%n", oponents);
        System.out.printf("Moves made: %d", moves);



    }
}

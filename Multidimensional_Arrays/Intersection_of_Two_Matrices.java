import java.util.Scanner;

public class Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrixA = new char[rows][cols];
        char[][] matrixB = new char[rows][cols];
        char[][] matrixC = new char[rows][cols];



        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[0].length; col++) {
                matrixA[row][col] = scanner.next().charAt(0);
            }
        }

        for (int row = 0; row < matrixB.length; row++) {
            for (int col = 0; col < matrixB[0].length; col++) {
                matrixB[row][col] = scanner.next().charAt(0);
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrixA[row][col] == matrixB[row][col]) {
                    matrixC[row][col] = matrixA[row][col];
                } else {
                    matrixC[row][col] = '*';
                }
            }
        }
        for (int i = 0; i < matrixC.length; i++) {

            for (int j = 0; j < matrixC[0].length; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

    }
}

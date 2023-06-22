import java.util.Arrays;
import java.util.Scanner;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");
        char[][] field = new char[n][];
        int startRow = 0;
        int startCol = 0;
        int totalFood = 0;

        for (int i = 0; i < n; i++) {
            field[i] = scanner.nextLine().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (field[i][j] == 's') {
                    startRow = i;
                    startCol = j;
                }
                if (field[i][j] == 'f') {
                    totalFood++;
                }
            }

        }
        while (totalFood == 0) {
            for (String command : commands) {
                switch (command) {
                    case "up":
                    case "down":
                    case "left":
                    case "right":
                }
            }
        }
    }
}

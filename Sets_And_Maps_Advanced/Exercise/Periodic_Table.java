package Exercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> element = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                element.add(input[j]);
            }
        }
        for (String e: element
             ) {
            System.out.print(e + " ");

        }
    }
}

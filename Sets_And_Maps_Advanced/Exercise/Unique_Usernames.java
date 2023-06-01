package Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Set<String> usernames = new LinkedHashSet<>();
        for (int i = 1; i <= num; i++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }
        for (String username: usernames
             ) {
            System.out.println(username);

        }
    }
}

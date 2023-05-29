import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> guests = new TreeSet<>();

        while (!input.equals("PARTY")) {
            if (input.length() == 8) {
                guests.add(input);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")) {
            guests.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(guests.size());
        for (String guest: guests
             ) {
            System.out.println(guest);

        }
    }
}

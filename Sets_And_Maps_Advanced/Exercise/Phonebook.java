package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> contact = new LinkedHashMap<>();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String number = input.split("-")[1];
            contact.put(name,number);
            input = scanner.nextLine();
        }
        String name = scanner.nextLine();
        while (!name.equals("stop")) {
            if (contact.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, contact.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
            name = scanner.nextLine();
        }
    }
}

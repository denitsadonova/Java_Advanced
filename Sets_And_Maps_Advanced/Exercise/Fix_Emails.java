package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, String> validEmails = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!(email.endsWith("uk") || email.endsWith("us") || email.endsWith("com"))) {
                validEmails.put(name, email);
            } else {
                name = scanner.nextLine();
               continue;
            }

            name = scanner.nextLine();
        }
        validEmails.entrySet().forEach(entry -> System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue()));
    }
}

package Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> chars = new TreeMap();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!chars.containsKey(currentChar)) {
               chars.put(currentChar, 1);
            } else {
                chars.put(currentChar, chars.get(currentChar) + 1);
            }
        }
        chars.entrySet().forEach(entry -> System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue()));
    }
}

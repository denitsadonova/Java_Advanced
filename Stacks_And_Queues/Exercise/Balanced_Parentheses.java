package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean isValid = false;
        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                openBrackets.push(bracket);
            }
            else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (openBrackets.isEmpty()) {
                    isValid = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop();

                 if (lastOpenBracket == '(' && bracket == ')') {
                    isValid = true;
                }
                else if (lastOpenBracket == '{' && bracket == '}') {
                    isValid = true;
                } else if (lastOpenBracket == '[' && bracket == ']') {
                    isValid = true;
                }
                else {
                    isValid = false;
                    break;
                }
            }
        }
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

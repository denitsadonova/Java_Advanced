import java.util.ArrayDeque;
import java.util.Scanner;

public class Matching_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> indices = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                indices.push(i);
            } else if (input.charAt(i) == ')') {
                int firstBracket = indices.pop();
                String result = input.substring(firstBracket, i + 1);
                System.out.println(result);
            }

        }
    }
}

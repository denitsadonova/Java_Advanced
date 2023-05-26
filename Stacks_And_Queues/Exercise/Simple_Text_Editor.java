package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Text_Editor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("1")) {
                textStack.push(text.toString());
                String textToAppend = command.split("\\s+")[1];
                text.append(textToAppend);

            } else if (command.startsWith("2")) {
                textStack.push(text.toString());
                int count = Integer.parseInt(command.split("\\s+")[1]);
                text.delete(text.length() - count, text.length());

            } else if (command.startsWith("3")) {
                textStack.push(text.toString());
                int position = Integer.parseInt(command.split("\\s+")[1]);
                if (position > 1) {
                    System.out.println(text.charAt(position - 1));
                } else {
                    System.out.println(text.charAt(0));
                }
            } else if (command.startsWith("4")) {
                if (!textStack.isEmpty()) {
                   String lastText = textStack.pop();
                   text = new StringBuilder(lastText);
                }


            }

        }

    }
}

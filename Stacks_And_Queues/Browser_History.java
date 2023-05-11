import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (stack.isEmpty() || stack.size() == 1) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }
                    stack.pop();

            } else {
                stack.push(command);
            }

            System.out.println(stack.peek());

            command = scanner.nextLine();
        }
    }
}

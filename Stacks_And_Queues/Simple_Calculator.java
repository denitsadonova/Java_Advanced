import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] exp = expression.split(" ");
        List<String> ex = Arrays.asList(exp);
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.addAll(ex);
        while (stack.size() > 1) {
            int firstNum = Integer.parseInt(stack.pop());
            String sign = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());
            int result = 0;

            switch (sign) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                default:
                    return;
            }
            stack.push("" + result);

        }
        System.out.println(stack.peek());


    }
}

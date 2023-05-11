import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        String binaryNum = "";
        if (num == 0) {
            System.out.println("0");
        }
        while (num > 0) {
            numbers.push(num % 2);
            num = num / 2;
        }
        while (numbers.size() > 0) {
            binaryNum = binaryNum + numbers.pop();
        }
        System.out.println(binaryNum);

    }
}

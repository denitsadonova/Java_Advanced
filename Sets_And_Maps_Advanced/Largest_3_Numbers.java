
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());
        for (int i = 0; i < 3; i++) {
            if (list.size() >= 3) {
            System.out.print(list.get(i) + " ");
        }
            else {
                break;
            }
        }
        if (list.size() < 3) {
            for (int n: list
                 ) {
                System.out.print(n + " ");

            }
        }
    }
}

package Exercise;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        Function<List<Integer>, Integer> getMinNumber = list -> Collections.min(list);

        int minElement = getMinNumber.apply(numbers);
        System.out.println(minElement);
    }
}
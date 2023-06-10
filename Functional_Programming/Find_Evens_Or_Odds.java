import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Find_Evens_Or_Odds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lowerBound = Integer.parseInt(input.split("\\s+")[0]);
        int upperBound = Integer.parseInt(input.split("\\s+")[1]);
        String filter = scanner.nextLine();

        List<Integer> listOfNumbers = new ArrayList<>();

        IntStream.rangeClosed(lowerBound, upperBound).forEach(p -> listOfNumbers.add(p));

        Predicate<Integer> filterByType = getFilterByType(filter);


        listOfNumbers.stream().filter(filterByType).forEach(n -> System.out.print(n + " "));

        System.out.println();
    }

    private static Predicate<Integer> getFilterByType(String filter) {
        switch (filter) {
            case "even":
                return n -> n % 2 == 0;
            case "odd":
                return n -> n % 2 != 0;
            default:
                throw new IllegalArgumentException("Unknown condition " + filter);
        }
    }
}
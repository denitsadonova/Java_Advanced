import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Add_Vat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] prices = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        UnaryOperator<Double> priceWithVat = p -> p * 1.2;

        System.out.println("Prices with VAT:");
        Arrays.stream(prices).forEach(p -> System.out.printf("%.2f%n", priceWithVat.apply(p)));
    }
    }

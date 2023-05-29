import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<Double, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            double num = Double.parseDouble(input[i]);

            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (double key: map.keySet()
             ) {
            System.out.printf("%.1f -> %d%n", key, map.get(key));

        }

        }

}

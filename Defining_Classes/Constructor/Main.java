package Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        String brand = "unknown";
        String model = "unknown";
        int horsePower = -1;

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");

            Car car = data.length == 1
                    ? new Car(data[0])
                    : new Car(data[0], data[1], Integer.parseInt(data[2]));

//            if (data.length == 3) {
//                 brand = data[0];
//                 model = data[1];
//                 horsePower = Integer.parseInt(data[2]);
//            } else if (data.length == 2) {
//                 brand = data[0];
//                 model = data[1];
//            } else {
//                 brand = data[0];
//            }
//
//            Car car = new Car(brand, model, horsePower);


            carList.add(car);
        }
        carList.forEach(e -> System.out.println(e.toString()));

    }
}


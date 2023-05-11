import java.util.ArrayDeque;
import java.util.Scanner;

public class Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> sites = new ArrayDeque<>();

        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (sites.size() == 0) {
                System.out.println("Printer is on standby");
            } else {
                    System.out.println("Canceled " + sites.poll());
                } }
            else {
                sites.offer(command);
            }

            command = scanner.nextLine();
        }
       while (sites.size() > 0) {
           System.out.println(sites.poll());
       }
    }
}

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class War {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstDeck = scanner.nextLine().split(" ");
        String[] secondDeck = scanner.nextLine().split(" ");
        Set<Integer> firstPlayer = new LinkedHashSet<>();
        Set<Integer> secondPlayer = new LinkedHashSet<>();
        for (String s : firstDeck) {
            firstPlayer.add(Integer.parseInt(s));
        }
        for (String s : secondDeck) {
            secondPlayer.add(Integer.parseInt(s));
        }
        int count = 1;
       while (count <= 50 || firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
           int firstNum = firstPlayer.iterator().next();
           firstPlayer.remove(firstNum);
           int secondNum = secondPlayer.iterator().next();
           secondPlayer.remove(secondNum);
           if (firstNum > secondNum) {
               firstPlayer.add(firstNum);
               firstPlayer.add(secondNum);
           } else if (secondNum > firstNum) {
               secondPlayer.add(firstNum);
               secondPlayer.add(secondNum);
           }
           count++;
       }
       if (firstPlayer.size() > secondPlayer.size()) {
           System.out.println("First player win!");
       } else if (secondPlayer.size() > firstPlayer.size()) {
           System.out.println("Second player win!");
       } else {
           System.out.println("Draw!");
       }
    }
}

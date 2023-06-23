import javax.sound.midi.Patch;
import java.util.*;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] textiles = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] medicaments = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> textilesQueue = new ArrayDeque<>();
        Deque<Integer> mediStack = new ArrayDeque<>();
//        int patch = 30;
//        int Bandage = 40;
//        int Medkit = 100;
        Map<String, Integer> done = new LinkedHashMap<>();
        for (int i = 0; i < textiles.length; i++) {
            textilesQueue.offer(textiles[i]);
        }
        for (int i = 0; i < medicaments.length; i++) {
            mediStack.push(medicaments[i]);
        }
        boolean isFound = false;

        while (!textilesQueue.isEmpty()) {
            int currentTextile = textilesQueue.peek();
            int currentMedicine = mediStack.pop();
            int sum = currentMedicine + currentTextile;
            switch (sum) {
                case 30:
                    if (done.containsKey("Patch")) {
                        done.put("Patch", done.get("Patch") + 1);
                    } else {
                        done.put("Patch", 1);
                    }
                    isFound = true;
                    break;
                case 40:
                    if (done.containsKey("Bandage")) {
                        done.put("Bandage", done.get("Bandage") + 1);
                    } else {
                        done.put("Bandage", 1);
                    }

                isFound = true;
                    break;
                case 100:
                    if (done.containsKey("MedKit")) {
                        done.put("MedKit", done.get("MedKit") + 1);
                    } else {
                        done.put("MedKit", 1);
                    }
                isFound = true;
                    break;
            }
            if (sum > 100) {
                if (done.containsKey("MedKit")) {
                    done.put("MedKit", done.get("MedKit") + 1);
                } else {
                    done.put("MedKit", 1);
                }
                sum = sum - 100;
           int current = mediStack.pop();
                mediStack.push(current + sum);
            } else if (!isFound) {
                currentMedicine = currentMedicine + 10;
                mediStack.push(currentMedicine);
            }
            isFound = false;
            textilesQueue.poll();

            if (mediStack.isEmpty()) {
                break;
            }
        }

        if (textilesQueue.isEmpty() && mediStack.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textilesQueue.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else if (mediStack.isEmpty()) {
            System.out.println("Medicaments are empty.");
        }

        Comparator<String> valueComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int valueCompare = done.get(s2).compareTo(done.get(s1));
                if (valueCompare == 0) {
                    return s1.compareTo(s2);
                }
                return valueCompare;
            }
        };
        Map<String, Integer> sortedMap = new TreeMap<>(valueComparator);
        sortedMap.putAll(done);


        sortedMap.entrySet().forEach(entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));

        if (!textilesQueue.isEmpty()) {
            System.out.print("Textiles left: ");
            while (!textilesQueue.isEmpty()) {
                if (textilesQueue.size() > 1) {

                System.out.print(textilesQueue.poll() + ", ");
            } else  {
                    System.out.print(textilesQueue.poll());
                }
            } }

            if (!mediStack.isEmpty()) {
                System.out.print("Medicaments left: ");
                while (!mediStack.isEmpty()) {
                    if (mediStack.size() > 1) {
                    System.out.print(mediStack.pop() + ", ");
                } else {
                        System.out.println(mediStack.pop());
                    }
            } }

        }
}
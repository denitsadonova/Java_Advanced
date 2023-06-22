
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class OS_Planing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tasksArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] threadsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(scanner.nextLine());
        Deque<Integer> tasks = new ArrayDeque<>();
        Deque<Integer> threads = new ArrayDeque<>();
        for (int j : tasksArr) {
            tasks.push(j);
        }
        for (int j : threadsArr) {
            threads.offer(j);
        }

        while (target != 0) {
            int task = tasks.pop();
            int thread = threads.peek();
            if (task == target) {
                System.out.printf("Thread with value %d killed task %d%n", thread, target);
                target = 0;
                break;
            }
            threads.poll();
            if (task > thread) {
                tasks.push(task);
            }
//            tasks.pop();
//                threads.poll();
//            } else {
//                    threads.poll();
//                }
        }
        for (int i : threads) {
            System.out.print(i + " ");
        }

    }
}

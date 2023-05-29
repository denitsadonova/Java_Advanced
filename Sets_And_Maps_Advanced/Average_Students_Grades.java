import java.util.*;

public class Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> student = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String studentData = scanner.nextLine();
            String name = studentData.split(" ")[0];
            double grade = Double.parseDouble(studentData.split(" ")[1]);

                if (!student.containsKey(name)) {
                    List<Double> currentGrade = new ArrayList<>();
                    currentGrade.add(grade);
                    student.put(name, currentGrade);
                } else {
                    List<Double> currentGrade = student.get(name);
                    currentGrade.add(grade);
                    student.put(name, currentGrade);
                }
        }
        for (Map.Entry<String, List<Double>> entry : student.entrySet()) {
            double num = 0;
            int count = 0;
            for (Double number : entry.getValue()) {
                num += number;
                count++;
            }
            double result = num / count;
            System.out.printf("%s -> ", entry.getKey());
            for (int i = 0; i < count; i++) {
                System.out.printf("%.2f ", entry.getValue().get(i));
            }
            System.out.printf("(avg: %.2f)%n", result);
        }

}
}
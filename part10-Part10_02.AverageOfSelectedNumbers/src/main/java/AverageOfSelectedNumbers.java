
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String parity = scanner.nextLine();
        double avg;
        if (parity.equals("n"))
        {
            avg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
            System.out.println("average of the negative numbers: " + avg);
        }
        else 
        {
            avg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
            System.out.println("average of the positive numbers: " + avg);
        }
    }
}

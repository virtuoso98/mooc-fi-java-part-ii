
import java.util.Scanner;
import java.lang.Math;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            int val = Integer.valueOf(input);
            int cube = val * val * val;
            System.out.println(cube);
        }
    }
}

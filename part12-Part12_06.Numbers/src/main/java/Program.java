
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many random numbers should be printed?");
        int times = Integer.valueOf(scanner.nextLine());
        while (times > 0) {
            System.out.println(new Random().nextInt(11));
            times--;
        }
    }
}

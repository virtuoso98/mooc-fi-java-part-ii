import java.util.Scanner;
import java.lang.Math;

public class LiquidContainers {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maximum = 100;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            System.out.println("First: " + first + "/" + maximum);
            System.out.println("Second: " + second + "/" + maximum);
            
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount >= 0) {
                switch(cmd) {
                    case "add":
                        first = Math.min(maximum, first + amount);
                        break;
                    case "move":
                        int toMove = Math.min(amount, first);
                        first -= toMove;
                        second = Math.min(second + toMove, maximum);
                        break;
                    case "remove":
                        int toRemove = Math.min(amount, second);
                        second -= toRemove;
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("First: " + first + "/" + maximum);
        System.out.println("Second: " + second + "/" + maximum);
    }
}

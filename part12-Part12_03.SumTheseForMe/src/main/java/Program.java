
import java.util.Scanner;
import java.lang.Math;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }

    public static int sum(
            int[] array, 
            int fromWhere, 
            int toWhere, 
            int smallest, 
            int largest) {
        int from = Math.max(0, fromWhere);
        int to = Math.min(array.length, toWhere);
        int sum = 0;
        for (int i = from; i < to; i ++) {
            int num = array[i];
            if (smallest <= num && num <= largest) {
                sum += num;
            }
        }
        return sum;
    }
}

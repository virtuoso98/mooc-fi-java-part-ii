
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int[] x : array) {
            for (int y : x) {
                sb.append(y);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

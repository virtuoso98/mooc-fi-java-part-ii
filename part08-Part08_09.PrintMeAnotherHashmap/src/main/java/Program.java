
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String,Book> hashmap) {
        for (String title : hashmap.keySet()) {
            System.out.println(hashmap.get(title));
        }
    }
    
    public static void printValueIfNameContains(
            HashMap<String,Book> hashmap, 
            String text) {
        for (Book e : hashmap.values()) {
            if (e.getName().contains(text.toLowerCase().trim())) {
                System.out.println(e);
            }
        }
    }
}

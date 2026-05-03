import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Loop through the list
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Geeks {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Apple");

        Collections.sort(al); // Using Collections class

        System.out.println(al);
    }
}

import java.util.ArrayList;
import java.util.List;

public class CheckedConversion {
    public static void main(String[] args) {
        List<String> result = new ArrayList();
        result.add("I am the 1st String.");
        result.add("I am the 2nd String.");
        result.add("I am the 3rd String.");
        System.out.println(result.get(0));
        System.out.println(result.get(1));
        System.out.println(result.get(2));
        System.out.println("passed");
    }
}

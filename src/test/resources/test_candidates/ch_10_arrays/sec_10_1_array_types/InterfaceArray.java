public class InterfaceArray {
    public static void main(String[] args) {
        ISome[] arr = new ISome[] { null, null };        
        System.out.println(arr.length);
        System.out.println("passed");
    }
}

interface ISome {}
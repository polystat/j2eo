
public class ReverseStringExampleAnotherWay {
    public static void main(String args[]) {
        String s;
        s = "CoAW IDAjtBlkUqtV";
        System.out.print("After reverse string is: ");
        for (int i = s.length(); i > 0; --i) {
            System.out.print(s.charAt(i - 1));
        }
        System.out.println();
        System.out.println("passed");
    }
}


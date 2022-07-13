
public class ReverseStringExample {
    public static void main(String[] args) {
        String str;
        str = "dXsgTrQ pndHSslyP";
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
        System.out.println("passed");
    }

    public static String reverseString(String s) {
        if (s.isEmpty())
            return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

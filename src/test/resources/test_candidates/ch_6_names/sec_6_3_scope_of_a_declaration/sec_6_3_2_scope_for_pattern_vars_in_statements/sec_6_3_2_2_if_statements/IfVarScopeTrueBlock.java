public class IfVarScopeTrueBlock {

    public static void main(String[] args) {
        Object str = "some";
        if (str instanceof String s) {
            s = s + "_mod";
            System.out.println("s = " + s);
        } else {
            System.out.println("failed");
        }
        System.out.println("passed");
    }
}
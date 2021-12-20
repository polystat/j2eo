public class IfVarScopeTrueBlock {

    public static void main(String[] args) {
        Object str = "some2";
        if (!(str instanceof String s)) {
            //str = "some3";  // ERROR
            System.out.println("failed");
        } else {
            s = s + "_mod";
            System.out.println("s = " + s);
        }
        System.out.println("passed");
    }
}
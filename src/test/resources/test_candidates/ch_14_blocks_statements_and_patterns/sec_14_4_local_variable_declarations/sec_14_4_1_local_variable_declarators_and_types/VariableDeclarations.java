public class VariableDeclarations {
    public static void main(String[] args) {
        var a = 1;
        System.out.println(a);

        var b = java.util.List.of(1, 2); 
        System.out.println(b);

        var c = "x".getClass();
        System.out.println(c);

        // var d = new Object() {};
        // System.out.println(d);
        
        var e = (CharSequence & Comparable<String>) "x";
        System.out.println(e);

        // var f = () -> "hello";
        // System.out.println(f);

        // var g = null;
        // System.out.println(g);

        System.out.println("passed");
    }
}
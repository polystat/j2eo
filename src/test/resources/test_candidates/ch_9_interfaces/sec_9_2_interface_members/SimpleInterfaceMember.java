public class SimpleInterfaceMember {
    public static void main(String[] args) {
        System.out.println(ISome.a);
        System.out.println(ISome.line);
    }
}

interface ISome {
    final int a = 5;
    final String line = "passed";
}
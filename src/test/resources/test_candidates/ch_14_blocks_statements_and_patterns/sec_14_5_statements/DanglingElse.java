public class DanglingElse {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 4;
        if (a > b)
            if (c > b)
                System.out.println("not passed");
        else
            System.out.println("passed");
    }
}
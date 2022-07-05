

public class Pattern {
    public static void main(String[] args) {
        int lines = 4;
        int i, j;
        for (i = 1; i <= lines; i++) {
            for (j = 1; j <= lines; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while (j >= 1) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }
            System.out.println("");
        }
        System.out.println("passed");
    }
}

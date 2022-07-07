
public class Pattern1 {
    public static void main(String[] args) {
        int lines = 8;
        int i, j;
        for (i = 1; i < lines; i++) {
            for (j = 1; j <= lines / 2; j++) {
                if (i == j) {
                    System.out.print(j);
                } else if (i > 4 && j == lines - i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            j = j - 2;
            while (j > 0) {
                if (i == j) {
                    System.out.print(j);
                } else if (i > 4 && j == lines - i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }

                j--;
            }
            System.out.println("");
        }
        System.out.println("passed");
    }
}

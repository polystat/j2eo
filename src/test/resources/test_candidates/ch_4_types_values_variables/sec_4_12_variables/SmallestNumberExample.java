

public class SmallestNumberExample {
    public static void main(String[] args) {
        int a, b, c, smallest, temp;
        a = 13;
        b = 1338;
        c = 138;
        temp = a < b ? a : b;
        smallest = c < temp ? c : temp;
        System.out.println("The smallest number is: " + smallest);
        System.out.println("passed");
    }
}

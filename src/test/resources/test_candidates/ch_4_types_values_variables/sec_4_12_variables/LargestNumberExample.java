
public class LargestNumberExample {
    public static void main(String[] args) {
        int a, b, c, largest, temp;
        a = 23;
        b = 2333;
        c = 233;
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println("The largest number is: " + largest);
        System.out.println("passed");
    }
}

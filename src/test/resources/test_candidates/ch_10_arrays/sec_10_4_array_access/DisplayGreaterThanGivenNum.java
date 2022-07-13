
public class DisplayGreaterThanGivenNum {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size N
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = -(i - 5) * (i - 5) + 15;
        }

        int num = 12;

        // display numbers greater then given number
        System.out.println("Numbers greater then given number = ");
        display(numbers, num);
        System.out.println("passed");
    }

    // method to display numbers greater than given number
    public static void display(int[] numbers, int num) {
        // traverse through the array
        for (int i : numbers) {
            if (i > num)
                System.out.print(i + " ");
        }

    }
}
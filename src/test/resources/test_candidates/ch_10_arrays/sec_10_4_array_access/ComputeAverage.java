
public class ComputeAverage {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size N
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = (i + 10) * (i - 15) * (i - 2) * (i - 5);
        }

        // find average value
        double avg = average(numbers);

        // display average
        System.out.println("Average = " + avg);

        // display numbers greater then average
        System.out.println("Numbers greater then average = ");
        display(numbers, avg);
        System.out.println("passed");
    }

    // method to display numbers greater than average
    public static void display(int[] numbers, double avg) {
        // traverse through the array
        for (int i : numbers) {
            if (i > avg)
                System.out.print(i + " ");
        }

    }

    // method to find average of the array
    public static double average(int[] numbers) {
        // variable
        int sum = 0;

        // traverse through the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // find sum
        }

        // return average value
        return sum / numbers.length;
    }
}
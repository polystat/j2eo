public class ArrayAverage {
    public static void main(String[] args) {

        double array[] = {10, 20, 30, 40, 50};
        // declare sum variable, & initialize with 0
        double sum = 0.0;
        // declare average variable
        double avg = 0.0;

        // loop to iterate the array
        for (int i = 0; i < array.length; i++) {
            // add numbers
            sum = sum + array[i];
        }

        // calculate the average value
        avg = sum / array.length;

        // display result
        System.out.println("Average: " + avg);
        System.out.println("passed");
    }
}
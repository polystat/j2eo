
public class EvilNumberExample {

    public static boolean checkNumber(int n) {

        long binaryNumber = convertToBinary(n);

        int count = 0;

        while (binaryNumber != 0) {

            if (binaryNumber % 10 == 1)
                count++;

            binaryNumber = binaryNumber / 10;
        }

        if (count % 2 == 0)
            return true;
        return false;
    }

    private static long convertToBinary(int number) {
        long binaryNumber = 0;
        int rem = 0;
        int j = 1;
        while (number != 0) {
            rem = number % 2;
            binaryNumber += rem * j;
            number = number / 2;
            j = j * 10;
        }

        return binaryNumber;
    }

    public static void main(String[] args) {
        int num = 0;

        num = 435;

        if (checkNumber(num))
            System.out.println(num + " is an evil number");
        else
            System.out.println(num + " is not an evil number");
        System.out.println("passed");
    }
}

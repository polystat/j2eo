
public class BouncyNumberExample {
    public static void main(String args[]) {
        int inputNumber = 219;
        if (isIncreasing(inputNumber) || isDecreasing(inputNumber) || inputNumber < 101)
            System.out.println(inputNumber + " not a bouncy number.");
        else
            System.out.println(inputNumber + " is a bouncy number.");
        System.out.println("passed");
    }

    public static boolean isIncreasing(int inputNumber) {
        String str = Integer.toString(inputNumber);
        char digit;
        boolean flag = true;
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            if (digit > str.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isDecreasing(int inputNumber) {
        String str = Integer.toString(inputNumber);
        char digit;
        boolean flag = true;
        for (int i = 0; i < str.length() - 1; i++) {
            digit = str.charAt(i);
            if (digit < str.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

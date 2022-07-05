
public class BuzzNumberExample {

    static boolean checkNumber(int number) {
        if (number % 10 == 7 || number % 7 == 0)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        int n1, n2;

        n1 = 214;

        n2 = 214;

        if (checkNumber(n1))
            System.out.println(n1 + " is a Buzz number");
        else
            System.out.println(n1 + " is not a Buzz number");
        if (checkNumber(n2))
            System.out.println(n2 + " is a Buzz number");
        else
            System.out.println(n2 + " is not a Buzz number");
        System.out.println("passed");
    }
}

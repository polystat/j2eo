
public class ISBNNumberExample {

    static boolean checkISBNNumber(long number) {
        int sum = 0;
        int i, t, intNumber, dNumber;
        String strNumber;

        strNumber = "" + number;

        if (strNumber.length() != 10) {
            return false;
        }

        for (i = 0; i < strNumber.length(); i++) {
            intNumber = Integer.parseInt(strNumber.substring(i, i + 1));
            dNumber = i + 1;
            t = dNumber * intNumber;
            sum = sum + t;
        }


        if ((sum % 11) == 0) {
            return true;
        }

        return false;

    }

    public static void main(String args[]) {
        long n1, n2;
        n1 = 12302323L;
        n2 = 3463465346L;
        if (checkISBNNumber(n1))
            System.out.println(n1 + " is a valid ISBN number");
        else
            System.out.println(n1 + " is not a valid ISBN number");
        if (checkISBNNumber(n2))
            System.out.println(n2 + " is a a valid ISBN number");
        else
            System.out.println(n2 + " is not a valid ISBN number");
        System.out.println("passed");
    }
}

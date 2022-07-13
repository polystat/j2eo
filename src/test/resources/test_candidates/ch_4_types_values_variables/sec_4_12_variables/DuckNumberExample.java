
public class DuckNumberExample {

    public static boolean checkNumber(int number) {

        while (number != 0) {

            if (number % 10 == 0)
                return true;
            number = number / 10;
        }

        return false;
    }

    public static void main(String args[]) {
        int n1, n2;
        n1 = 490;
        n2 = 443;
        if (checkNumber(n1))
            System.out.println(n1 + " is a Duck number");
        else
            System.out.println(n1 + " is not a Duck number");
        if (checkNumber(n2))
            System.out.println(n2 + " is a Duck number");
        else
            System.out.println(n2 + " is not a Duck number");
        System.out.println("passed");
    }
}

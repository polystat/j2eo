
public class ATMExample {
    public static void main(String args[]) {
        int balance = 100000, withdraw, deposit;
        int[] choices = {1, 2, 3, 4};
        outer:
        for (int choice : choices) {
            switch (choice) {
                case 1:
                    withdraw = 372;
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    deposit = 32;
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    break;

                case 4:
                    break outer;
            }
        }
        System.out.println("passed");
    }
}

import java.util.Scanner;
class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int org_pin = 2010;
        System.out.println("Enter PIN : ");
        int user_pin = sc.nextInt();

        int attempt = 0;
        while (user_pin != org_pin ) {
            attempt++;
            if(attempt >= 3) {
                System.out.println("To many failed try aftwe some time");
                return;
            } else {

                System.out.println("you have " + (3 - attempt) + " left try again");
                System.out.println("Enter PIN : ");
                user_pin = sc.nextInt();
            }
        }
        System.out.println("Welcome to ATM");


        int min_bal = 1000;
        int balance = 2000;
        System.out.println("Current balance = " + balance);

        sc.nextLine(); //clear buffer

        System.out.println("creadit or withdraw");
        String act = sc.nextLine().toLowerCase();

        System.out.println("enter amount : ");
        int amount = sc.nextInt();

        switch(act) {
            case "creadit" : 
                balance += amount;
            break;

            case "withdraw" : 
                if(amount > balance || balance-amount  <= min_bal) {
                    System.out.println("Insufficient balance or minimum balance is 1000");
                    return;
                }
                balance -= amount;
            break;

            default:
                System.out.println("invalid operator");
        }

        System.out.println("Updated balance : " + balance);
        sc.close();

    }
}
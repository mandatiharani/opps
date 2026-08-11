class Account {
    int accountNo;
    String accountType;
    int accountBalance;

    Account(int accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    void withdraw(int amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(int amount) {
        accountBalance += amount;
        System.out.println("Deposit Successful");
    }

    void displayAccountDetails() {
        System.out.println("Account No : " + accountNo);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account Balance : " + accountBalance);
        System.out.println();
    }
}

public class accdemowithconstructors {

    public static void main(String[] args) {

        Account a1 = new Account(123467, "SB", 10000);

        a1.displayAccountDetails();

        a1.deposit(1000);
        a1.displayAccountDetails();

        a1.withdraw(15000);
        a1.displayAccountDetails();
    }
}
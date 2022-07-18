class BankAccount {
//1) Create a BankAccount class.
    // instance things (belonging to particular bank acc)
    private double checkingBalance;
    private double savingsBalance;
//2) The class should have the following attributes: (double) checking balance, (double) savings balance.
    // static things (belonging to the BankAcc class)
    public static int numberOfAccounts = 0;
//3) Create a class member (static) that has the number of accounts created thus far.
    public static double totalHoldings = 0;
//4) Create a class member (static) that tracks the total amount of money stored in every account created.

    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

// depositing money
    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        }
        else {
            this.savingsBalance += amount;
        }
        
        this.totalHoldings += amount;
    }

// withdrawing money
    public void withdrawMoney(double amount, String account) {
        if (account == "checking") {
            if(amount > this.checkingBalance) {
                System.out.println("Insufficient Funds");
                return;
            }
            this.checkingBalance -= amount;
        }
        else {
            if(amount > this.savingsBalance) {
                System.out.println("Insufficient Funds");
                return;
            }
            this.savingsBalance -= amount;
        }
        
        this.totalHoldings -= amount;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
}
class TestBankAccount {
    public static void main(String[] args) {

		BankAccount dillonBankAccount = new BankAccount();
		dillonBankAccount.depositMoney(450.72, "checking");
		dillonBankAccount.depositMoney(100.00, "savings");
        dillonBankAccount.withdrawMoney(100.00, "savings");
        dillonBankAccount.withdrawMoney(150.00, "savings");
        dillonBankAccount.withdrawMoney(1000.00, "checking");

        BankAccount alexBankAccount = new BankAccount();
        alexBankAccount.depositMoney(200.00, "savings");
        alexBankAccount.depositMoney(300.00, "checking");
		alexBankAccount.withdrawMoney(50, "checking");
		alexBankAccount.withdrawMoney(1000, "savings");
        

		System.out.println(dillonBankAccount.getCheckingBalance());
        System.out.println(dillonBankAccount.getSavingsBalance());

        System.out.println(alexBankAccount.getCheckingBalance());
        System.out.println(alexBankAccount.getSavingsBalance());
        
        System.out.println(BankAccount.totalHoldings);
    }
}
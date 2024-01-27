package org.banksystem;

public class Test {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setFirstName("Aji");
        account.setLastName("Sangha");
        account.setAccountID(279274927);
        account.deposit(1000000.0);
        account.withdrawal(500000.0);

        System.out.println("Bank Account Summary:");
        account.accountSummary();
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Hajahi");
        checkingAccount.setLastName("Sanghal");
        checkingAccount.setAccountID(783952669);
        checkingAccount.deposit(20000.0);
        checkingAccount.processWithdrawal(25000.0);
        checkingAccount.setInterestRate(1.5);

        System.out.println("Checking Account Summary:");
        checkingAccount.displayAccount();
    }
}


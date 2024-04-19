package sysAdmin;

public class Fees {
    private float balance;
    private int bankAccountNumber;
    private boolean loan;

    public Fees(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void payFees(float balance) {
        this.balance += balance;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    protected void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public boolean isLoan() {
        return loan;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }
}

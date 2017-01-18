package pajerowski.tony;

/**
 * Created by anthonypajerowski on 1/17/17.
 */

public class BankAccount {

    private long accountNumber = 0;
    private AccountType accountType;
    private double accountBalance= 0d;  //want to implement BigDecimal
    private String accountHolderName;
    private float interestRate = 0f;
    private AccountStatus accountStatus;
    private OverDraftPrevention overDraftPrevention;

    public enum AccountStatus{
        OPEN, CLOSED, OFAC_FREEZE
    }

    public enum AccountType{
        SAVINGS, CHECKING, INVESTMENT
    }

    public enum OverDraftPrevention{
        ENABLED, DISABLED, AUTOMATIC_ACCOUNT_TRANSFER;
    }

    BankAccount(AccountType accountType , String name, double accountBalance) {
        this.accountNumber++;
        this.accountType = accountType;
        this.accountStatus = AccountStatus.OPEN;
        this.accountHolderName = name;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolderName(String newName) {
        if (accountStatus == AccountStatus.CLOSED) {
            System.out.println("The account is closed.");
        } else accountHolderName = newName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void makeDeposit(double deposit) {
        accountBalance += deposit;
    }

    public void makeWithdrawel(double withdrawel) {
        accountBalance -= withdrawel;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public float getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(float interest){

    }

}

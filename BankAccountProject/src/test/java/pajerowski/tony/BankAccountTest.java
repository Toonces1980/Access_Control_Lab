package pajerowski.tony;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/17/17.
 */
public class BankAccountTest {
    BankAccount bankAccount;

    @Test
    public void getAccountNumberTest() {
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING,"Bob's moneys", 0);
        Long expected = 1L;
        Long actual = bankAccount.getAccountNumber();
        assertEquals("First account should be initialized to 1", expected,actual);

    }

    @Test
    public void setAccountHolderNameTest() {
        String expected = "Lucy";
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING, "Barb", 0);
        bankAccount.setAccountHolderName("Lucy");
        String actual = bankAccount.getAccountHolderName();
        assertEquals("The name on the account was changed from 'Barb' to 'Lucy'", expected,actual);
    }

    @Test
    public void getAccountBalanceTest() {
        Double expected = 66.33;
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING, "Bob's moneys", 66.33);
        Double actual = bankAccount.getAccountBalance();
        assertEquals("Account balance was set to 66.33", expected, actual);
    }

    @Test
    public void setAccountBalanceTest() {
        Double expected = 55d;
        bankAccount = new BankAccount(BankAccount.AccountType.SAVINGS,"My Money", 0);
        bankAccount.setAccountBalance(55);
        Double actual = bankAccount.getAccountBalance();
        assertEquals("The balance was set to 55 using the setter", expected,actual);
    }

    @Test
    public void makeDepositTest() {
        Double expected = 15d;
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING, "Money", 0);
        bankAccount.makeDeposit(15);
        Double actual = bankAccount.getAccountBalance();
        assertEquals("'15' was deposited into an account that was opened with '0'",expected,actual);
    }

    @Test
    public void makeWithdrawelTest() {
        Double expected = 50d;
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING, "Money", 100);
        bankAccount.makeWithdrawel(50);
        Double actual = bankAccount.getAccountBalance();
        assertEquals("'50' was withdrawn from an account that started with '100'", expected,actual);
    }

    @Test
    public void getAccountHolderNameTest() {
        String expected = "Barbara";
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING,"Barbara",33);;
        String actual = bankAccount.getAccountHolderName();
        assertEquals("The name on the account was set to 'Barbara'", expected,actual);

    }

    @Test
    public void getAndsetInterestRateTest(){
        Float expected = 2.0f;
        bankAccount = new BankAccount(BankAccount.AccountType.CHECKING, "Bill", 0);
        bankAccount.setInterestRate(2.0f);
        Float actual = bankAccount.getInterestRate();
    }
}

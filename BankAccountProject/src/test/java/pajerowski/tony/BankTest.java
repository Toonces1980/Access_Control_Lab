package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by anthonypajerowski on 1/17/17.
 */
public class BankTest {
    Bank bank;
    BankAccount checking;
    BankAccount savings;

    @Before
    public void setup() {
        bank = new Bank();
    }

    @Test
    public void transferFundTest(){
        Double expected = 40d;
        checking = new BankAccount(BankAccount.AccountType.CHECKING, "Barbara", 100);
        savings = new BankAccount(BankAccount.AccountType.SAVINGS, "Barbara",0);
        bank.transferFunds(checking, 40, savings);
        Double actual = savings.getAccountBalance();
        assertEquals("The Amount of funds in the SAVINGS account should be changed to 60",expected,actual);
    }

    @Test
    public void transferFundNotAllowedTest(){
        Double expected = 0d;
        checking = new BankAccount(BankAccount.AccountType.CHECKING, "Barbara", 100);
        savings = new BankAccount(BankAccount.AccountType.SAVINGS, "Charles", 0 );
        bank.transferFunds(checking, 40,savings);
        Double actual = savings.getAccountBalance();
        assertEquals("The Amount of funds in SAVINGS account should remain 0",expected,actual);
    }
}

package pajerowski.tony;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by anthonypajerowski on 1/17/17.
 */
public class Bank {

    Set<String>  accountNumber = new HashSet<>();
    LinkedHashMap<String, String> accountTranscationHistory = new LinkedHashMap<>();

//  public void recordTransaction(){
//      accountTranscationHistory.put()
//  }
//
  public void transferFunds(BankAccount transferFrom, double fundAmount, BankAccount transferTo){
      if (transferFrom.getAccountHolderName().equals(transferTo.getAccountHolderName())) {
          transferFrom.makeWithdrawel(fundAmount);
          transferTo.makeDeposit(fundAmount);
      }
  }

}

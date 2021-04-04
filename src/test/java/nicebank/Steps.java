package nicebank;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import static org.junit.Assert.*;

public class Steps {

  @Given("^I have deposited \\$(\\d+) in my account$")
  public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
      System.out.println("This is new");
      Account myAccount = new Account();
      myAccount.deposit(amount);

      assertEquals("Incorrect account balance -",
		      amount, myAccount.getBalance());
  }
  
  @When("^I request \\$(\\d+)$")
  public void iRequest$(int arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      //throw new PendingException();
  }

  @Then("^\\$(\\d+) should be dispensed$")
  public void $ShouldBeDispensed(int arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }
  
}

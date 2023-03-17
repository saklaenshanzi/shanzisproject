package steps;

import org.junit.Assert;

import Cucumber.Cucumber.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Withdraw {
	
	Bank bank;
	
	@Given("I have an account with {int} amount")
	public void i_have_an_account_with_amount(Integer init) {
	    bank = new Bank(init);
	}

	@When("I withdraw {int} amount")
	public void i_withdraw_amount(Integer some) {
	    bank.withdraw(some);
	}


@Then("I verify the {int} in my account")
public void i_verify_the_in_my_account(Integer balance) {
   int expected_balance = balance;
   
   int actual_balance = bank.getBalance();
   
   Assert.assertEquals(expected_balance, actual_balance);
   
   
}
}

package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {

	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	   System.out.println("From Step 1");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   System.out.println("From Step 2");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	   System.out.println("From step 3");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("from step 4");
	}

	
	
}

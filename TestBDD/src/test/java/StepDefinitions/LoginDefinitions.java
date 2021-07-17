package StepDefinitions;

import static org.junit.Assert.assertArrayEquals;

import java.awt.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {

	@Given("User is registered with company")
	public void user_is_registered_with_company() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I'm a part of Trantor");
	}
	@Given("Status of user is active")
	public void status_of_user_is_active() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Still working in the org");
	}
	@When("I login with UN\\(arjun) and PWD\\(qwerty)")
	public void i_login_with_un_arjun_and_pwd_qwerty() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("UN - arjun and PWD - qwerty");
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Click the login button");
	}
	@Then("I am able to login")
	public void i_am_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login Successfull");
	}
	
	// ------------------InValid ---------------------------------------------

	@When("I login with UN\\(admin) and PWD\\(root)")
	public void i_login_with_un_admin_and_pwd_root() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("using UN(Admin) and PWD(root)");
	}
	@Then("I should not be able to login")
	public void i_should_not_be_able_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Invalid user creds");
	}

	@Given("The existing cache should be removed")
	public void the_existing_cache_should_be_removed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cache removed from browser");
	}
	
	// ------- param --------
	
//	@Given("user is registered")
//	public void user_is_registered() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Same steps");
//	}
//	@When("user navigates to login page")
//	public void user_navigates_to_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("user navigates to login page");
//	}
//	@When("enters the arjun and qwerty")
//	public void enters_the_arjun_and_qwerty() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("enters the arjun and qwerty");
//	}
//	@Then("user is able to login")
//	public void user_is_able_to_login() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Login successful param");
//	}
//
//
//	@When("enters the admin and root")
//	public void enters_the_admin_and_root() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("enter admin and root");
//	}
//	@Then("user is unable to login")
//	public void user_is_unable_to_login() {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("Unable to login");
//	}

	// ---------- DATAParam -----------------
	
	@When("user navigates to login page")
	public void user_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Navigating with data param");
	}
	@When("enter the data")
	public void enter_the_data(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    System.out.println("Print the value used in :"+dataTable );
	    
	    
	}
	@Then("Login or No Login")
	public void login_or_no_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Need to find out");
	}



	








}

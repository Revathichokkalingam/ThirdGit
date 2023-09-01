package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.*;


public class StepDefinition {
	@Given("User launches the chrome Browser")
	public void user_launches_the_chrome_browser() {
	  System.out.println("Chrome");
	}
	@Given("enters the URL {string}")
	public void enters_the_url(String string) {
		  System.out.println("URL");
	}
	@When("^User enters the (.+) and (.+)$")
	public void user_enters_the_and(String username, String password) {
		System.out.println(username+"    "+password);

	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		  System.out.println("Login done");
	}
	@When("clicks on the customer enters the information")
	public void clicks_on_the_customer_enters_the_information(List<String> data) {
System.out.println("email: "+data.get(0));
System.out.println("First name: "+data.get(1));
System.out.println("Second Name: " +data.get(2));
System.out.println("Customer: "+data.get(3));
	}
	@Then("Dashboard Tittle")
	public void dashboard_tittle() {
		  System.out.println("ASL");
	}

}

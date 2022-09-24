package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginn extends BaseClassA {

		@Given("Enter the username as {string}")
		public void userName(String uName) {
			driver.findElement(By.id("emp_no")).sendKeys(uName);
		}
		@Given("Enter the password as {string}")
		public void userPass(String uPass) {
			driver.findElement(By.id("pass")).sendKeys(uPass);
		}
		
		@When("Click the login button")
		public void loginButton() {
			driver.findElement(By.id("submit")).click();
		}
		@Then("Welcome page should be displayed")
		public void positive() {
			System.out.println("Welcome Page should be displayed");

		}
	}


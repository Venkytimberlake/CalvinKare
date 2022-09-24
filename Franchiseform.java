package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Franchiseform extends BaseClassA {

		@Given("Enter the Name")
		public void enterName() {
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			driver.findElement(By.id("f_name")).sendKeys("Vengat");
		}

		@Given("Enter the Email")
		public void enterEmail() {

			driver.findElement(By.id("email")).sendKeys("test@test.com");
		}

		@Given("Enter the Mobile Number")
		public void enterMobileNo() {

			driver.findElement(By.id("mobile")).sendKeys("1234567890");
		}

		@Given("Enter the Whatsapp No")
		public void enterWhatsAPP() {

			driver.findElement(By.id("mobile_same")).click();
		}

		@Given("Click the Male option")
		public void clickGender() {

			driver.findElement(By.id("gender")).click();
		}

		@Given("Click the Marital Status option")
		public void clickMaritalStatus() {

			driver.findElement(By.id("marital_status2")).click();
		}

		@Given("Click the Language option")
		public void clickLanguage() {
			driver.findElement(By.id("language2")).click();

		}

		@Given("Click the Occupation option")
		public void clickOccupation() {
			driver.findElement(By.id("occupation2")).click();

		}

		@When("Select the Educational Qualification  option")
		public void selectEducational() {

			WebElement drop = driver.findElement(By.name("education_q"));
			Select value = new Select(drop);
			value.selectByVisibleText("Degree Holder");

		}

		@Given("Enter the Individual's Monthly Income")
		public void enterIndividualMonthlyIncome() {

			driver.findElement(By.id("monthly_income")).sendKeys("5000");

		}

		@Given("Enter the Family's total Monthly Income")
		public void entertotalMonthIncome() {
			driver.findElement(By.id("family_income")).sendKeys("5000");
		}
		
		

		@When("Select the State option")
		public void selectState() {
			WebElement ss = driver.findElement(By.id("shop_sate"));
			Select value = new Select(ss);
			value.selectByValue("Tamilnadu");
		}
		
		@When ("Select the District option")
		public void selectDistrict() {
			driver.findElement(By.className("form-group")).sendKeys("Puducherry");			
		}
		
		@When ("Select the Town option")
		public void selectTown()
		{
			driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Puducherry");
		}
		
		@Given ("Enter the Address")
		public void selectAddress()
		
		{
			driver.findElement(By.xpath("//textarea[@placeholder='Type your address here...']")).sendKeys("11, Ram Nagar, Puducherry");
		}
		
		@Given ("Enter the Pincode")
		public void selectPincode() {
			driver.findElement(By.xpath("//textarea[@placeholder='Enter pincode..']")).sendKeys("600001");			
		}
		@Given ("Enter the Residing since : (year)")
		public void residence() {
			driver.findElement(By.xpath("//input[@placeholder='Select year']")).sendKeys("2000");
		}
		@Given ("Enter the Proof Type")
		public void proof() {
			WebElement rr = driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[4]"));
		Select ram=new Select(rr);
		ram.selectByValue("Aadhar");
		}
		
		 @When("Click the choose file option")
		 public void uploadFile() { WebElement
		 findElement = driver.findElement(By.id("image_proof"));
		 findElement.sendKeys("C:\\Users\\HP\\Desktop");
		  
		  }
		 
		 @When ("Click the next button")
		 public void submit() {
			 driver.findElement(By.xpath("//a[text()='Next']")).click();
		 }
	}
	

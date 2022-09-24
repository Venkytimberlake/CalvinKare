package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksA extends BaseClassA {
		@Before
		public void startApp() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://hub1.cavinkare.in/H_Parlour/index.php/LoginController/logout");
			 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			  driver.manage().window().maximize();
			
			
			
				}
		
	}


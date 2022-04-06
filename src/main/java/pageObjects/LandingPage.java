package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");
	
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public LoginPage LoginPage() {
		
		driver.findElement(signin).click();
		
		LoginPage lp = new LoginPage(driver);
		
		return lp;
		
	}
	
}

package Academy;


import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	
	
	 @BeforeTest
	 public void initialize() throws IOException {
		 
		 
		 driver = initializeDriver();
	 }
	 
	 @Test(dataProvider="getData")
	 
	 public void getNavigationPage(String username,String password) throws InterruptedException {
		 
		
		 driver.get(prop.getProperty("url"));
		 
		 		 
		 WebElement afficheCase= driver.findElement(By.xpath("//font[contains(text(),'NON MERCI')]"));
		 
		WebDriverWait w = new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOf(afficheCase));
		afficheCase.click();
		
	
		 
		 LandingPage l = new LandingPage(driver);
		 
		 LoginPage lp =l.LoginPage();
		 
		 lp.getEmail().sendKeys(username);
		 lp.getPassword().sendKeys(password);
		 lp.getLogin().click();
		 
	 }
	 
	 
	 @AfterTest
	 public void closeDriver() {
		 
		 driver.close();
	 }
	 @DataProvider
	 public Object[][] getData(){
		 
		 Object [][] data = new Object [2][2];
		 
		 data [0][0] ="jslah2008@yahoo.fr";
		 data [0][1]="12345";
		 data [1][0]="slaheddine.jeder.2021@gmail.com";
		 data [1][1]="123456";
		 return data;
		 
	 }
	 
	
}

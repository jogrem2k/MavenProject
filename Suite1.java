package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Suite1 {

	
	@Test(priority=1)
	public void register( ) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://magento.com");
		 
		 driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		 driver.findElement(By.id("register")).click();
		 driver.findElement(By.id("firstname")).sendKeys("Joseph");
		 driver.findElement(By.id("lastname")).sendKeys("Udeh");
		 driver.findElement(By.id("email_address")).sendKeys("jogrem2k@gmail.com");
		 
		 
		 Select cp = new Select  (driver.findElement(By.id("company_type")));	
		 cp. selectByIndex(3);
		 //cp.selectByValue("development");
		//cp.deselectByVisibleText("Provides deployment, customization and integration services to merchants");
		 
		 new Select  (driver.findElement(By.id("individual_role")));	
		 cp. selectByIndex(3);
		 //cp.selectByValue("Technical");
		//cp.deselectByVisibleText("Provides deployment, customization and integration services to merchants");
		 
		 new Select  (driver.findElement(By.id("country")));	
		 cp. selectByIndex(3);
		 //cp.selectByValue("development");
		//cp.deselectByVisibleText("Provides deployment, customization and integration services to merchants");
		 
		 
		 
		 driver.findElement(By.id("password")).sendKeys("welcome1");
		 driver.findElement(By.id("password-confirmation")).sendKeys("welcome1");
		 
	//	 driver.findElement(By.className("recaptcha-checkbox-border")).click();
		 
		 if(!driver.findElement(By.id("agree_terms")).isSelected());
		 
		 {
			 driver.findElement(By.id("agree_terms")).click();

	}
		 driver.quit();
		
	}
	@Test (priority=2)
	public void login() {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("http://google.com");
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span")).click();
		 driver.findElement(By.partialLinkText("selenium WebDriver")).click();
		 String title = driver.getTitle();
		 if(title.contentEquals("SeleniumHQ Browser Automation"))
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 System.out.println(title);
		 driver.quit();
	}
	@Test 
	public void login1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println(driver.getWindowHandles());
		
		Set<String> windids = driver.getWindowHandles();
		driver.switchTo().window((String) windids.toArray() [1]);
		
		driver.findElement(By.id("identifierId")).sendKeys("joseph");
		
		
		windids = driver.getWindowHandles();
		driver.switchTo().window((String) windids.toArray() [0]);
		
		
		driver.quit();
		
		
	}
}

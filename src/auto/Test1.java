package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
 public static void (String args[]) throws Exception 
 
 {
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://accounts.google.com/signin");
	   // driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("raoprashanth502@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("prash964");
	    
	    driver.findElement(By.id("passwordNext")).click();
	    
 }
}


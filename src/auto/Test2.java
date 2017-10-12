package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
 public static void main(String args[]) throws Exception 
 
 {
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// public void testFb() throws Exception {
		    driver.get("https://en-gb.facebook.com/login/");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys("8897090308");
		    driver.findElement(By.id("pass")).click();
		    driver.findElement(By.id("pass")).clear();
		    driver.findElement(By.id("pass")).sendKeys("8897090308");
		    driver.findElement(By.id("loginbutton")).click();
 }
}



package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class talentyfy {

	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	// public void testTalentify() throws Exception {
		    driver.get("http://talentify.in");
		    driver.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[7]/a")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys("raoprashanth502@gmail.com");
		    Thread.sleep(2000);
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("prash0502");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='navbar']/ul[2]/li[3]/a")).click();
		    driver.findElement(By.linkText("Logout")).click();
		  }
	
	
	
	
	}
	


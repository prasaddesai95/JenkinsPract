package sampleJen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchTest {

	WebDriver driver;
	
	@Test
	public void m1Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Browser launched sucess");
		
	}
}
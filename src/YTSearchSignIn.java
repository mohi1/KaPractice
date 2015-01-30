import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class YTSearchSignIn {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	@Before
	public void setUp() throws Exception{
		System.out.println("Hello this is @Before every @Test");
		driver = new FirefoxDriver();
		baseUrl = "http://www.youtube.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testYTSearchSignin() throws Exception {
		System.out.println("Hello this is @Test1");
		driver.get(baseUrl + "/");
		driver.findElement(By.id("masthead-search-term")).clear();
		driver.findElement(By.id("masthead-search-term")).sendKeys("QTP");
		driver.findElement( By.id("search-btn")).click();
		
		driver.findElement(By.linkText("Movies")).click();
		driver.findElement(By.linkText("upload")).click();
		
	}
	

}

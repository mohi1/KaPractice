package cool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Ex {
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
		username.sendKeys("hello");
		
		WebElement fp = driver.findElement(By.xpath("//*[@id='link-forgot-passwd']"));
		fp.click();
	}

}

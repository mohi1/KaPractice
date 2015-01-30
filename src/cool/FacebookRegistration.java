package cool;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
       WebDriver driver = new FirefoxDriver();
       driver.get("http://www.facebook.com");
       driver.manage().window().maximize();
       //driver.findElement(By.xpath(".//*{@id='u_0_1']")).sendKeys("anuka");
       WebElement monthdrop = driver.findElement(By.id("month"));
       List<WebElement> months = monthdrop.findElements(By.tagName("option"));
       for(int i = 0; i<months.size(); i++){
    	   String value =months.get(i).getText();
    	   System.out.println(value);
       }
       //driver.quit();
       
       		
	}

}

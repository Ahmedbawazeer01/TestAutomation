package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpagelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		//List<WebElement> objectname=driver.findElements(By.xpath("xpath Experssions"));
		List <WebElement> CountList=w.findElements(By.xpath("//a"));
		System.out.println("Total Number of Links" + CountList.size());
		for (WebElement webElement:CountList) {
			System.out.println(webElement.getText());
		}
		
	
	}

}

package test;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.amazon.com/");
		w.manage().window().maximize();
		List <WebElement> CountList=w.findElements(By.xpath("//a"));
		System.out.println("Total number of Links" + CountList.size());
		for (WebElement webElement:CountList) {
			System.out.println(webElement.getText());
			System.out.println("Hello");
		
		

	}

}
}

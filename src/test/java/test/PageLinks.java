package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		WebElement username_txt=w.findElement(By.cssSelector("input#email"));
		username_txt.sendKeys("Shaikahmed243@gmail.com");
		WebElement password=w.findElement(By.cssSelector("input#pass"));
		password.sendKeys("Hamad5011");
		WebElement Login_btn=w.findElement(By.cssSelector("button[name='login']"));
		Login_btn.click();
		
		
		

	}

}

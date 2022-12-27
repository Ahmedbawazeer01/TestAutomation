package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		//w.close();
		//System.out.println(w.getTitle());
		//System.out.println(w.getPageSource());
		WebElement username_txt=w.findElement(By.id("email"));
		username_txt.sendKeys("Shaikahmed243@gmail.com");
		WebElement password_txt=w.findElement(By.id("pass"));
		password_txt.sendKeys("Hamad5011");
		//WebElement login_btn=w.findElement(By.id("u_0_5_7H"));
		WebElement login_btn=w.findElement(By.name("login"));
		
		login_btn.click();
		

	}

}

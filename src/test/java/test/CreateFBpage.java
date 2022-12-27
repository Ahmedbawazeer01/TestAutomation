package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFBpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32V\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.manage().window().maximize();*/
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32V\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.facebook.com/");
		w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.manage().window().maximize();
	
        WebElement create_Account=w.findElement(By.xpath("//a[text()='Create New Account']"));
        create_Account.click();
        WebElement Firstname=w.findElement(By.xpath("//input[@name='firstname']"));
        Firstname.sendKeys("SIB");
        WebElement Lastname=w.findElement(By.xpath("//input[@name='lastname']"));
        Lastname.sendKeys("Bawazeer_Official");
        WebElement Email_id=w.findElement(By.xpath("//input[@name='reg_email__']"));
        Email_id.sendKeys("shaikahmed243@outlook.com");
        WebElement Mobile_No=w.findElement(By.xpath("//input[@name='reg_email__']"));
        Mobile_No.sendKeys("8688036672");
        WebElement Newpassword=w.findElement(By.xpath("//input[@name='reg_passwd__']"));
        Newpassword.sendKeys("Hamad5011");
        WebElement Day=w.findElement(By.id("day"));
        Day.sendKeys("10");
        WebElement Month=w.findElement(By.id("month"));
        Month.sendKeys("Aug");
        WebElement Year=w.findElement(By.id("year"));
        Year.sendKeys("2002");
        WebElement radio_btn=w.findElement(By.xpath("//label[text()='Male']"));
        //radio_btn.click();
        boolean selectGender=radio_btn.isSelected();
        if(selectGender==false) {
        	radio_btn.click();
        }
        WebElement submit=w.findElement(By.xpath("//button[@name='websubmit']"));
        submit.click();

	}

}

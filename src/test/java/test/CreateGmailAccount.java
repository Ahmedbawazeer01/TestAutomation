package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGmailAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2146937411%3A1671371855248836&continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F56256%3Fhl%3Den&ec=GAZAdQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh5MPZB9SldhOmTuSSr4Ai1P5Y8CDwwbQL177nEOUNdF-uQ2jjVm3ATE626zSX06Jdi8C9_0");
		w.manage().window().maximize();
			w.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			WebElement CreateAccount=w.findElement(By.xpath("//span[text()='Create account']"));
			CreateAccount.click();
			WebElement Click_btn=w.findElement(By.xpath("//span[text()='For my personal use']"));
			Click_btn.click();
			WebElement Firstname=w.findElement(By.xpath("//input[@name='firstName']"));
			Firstname.sendKeys("Hunk");
			WebElement Lastname=w.findElement(By.xpath("//input[@name='lastName']"));
			Lastname.sendKeys("Badshaah");
			WebElement usermail=w.findElement(By.xpath("//input[@type='email']"));
			usermail.sendKeys("hunkbadshaah868803");
			WebElement Password=w.findElement(By.xpath("//input[@name='Passwd']"));
			Password.sendKeys("Hamad5011");
			WebElement Confirm_password=w.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
			Confirm_password.sendKeys("Hamad5011");
			WebElement Click_Next=w.findElement(By.xpath("//span[text()='Next']"));
			Click_Next.click();
			//WebElement Click_Mobile=w.findElement(By.xpath("//span[text()='India (+91)']"));
			
			//Click_Mobile.click();
			WebElement Mobile=w.findElement(By.xpath("//input[@type='tel']"));
			Mobile.sendKeys("8688036672");
			WebElement Click_Nxt=w.findElement(By.xpath("//button[@data-idom-class='nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
			Click_Nxt.click();
			//WebElement Nt=w.findElement(By.xpath("//span[text()='Next']"));
			//Nt.click();
			
			//WebElement Select_Mobile=w.findElement(By.xpath("//id='c1'"))
					//span[text()='India (+91)']  
			//div[@class='VfPpkd-RLmnJb']
	}

}

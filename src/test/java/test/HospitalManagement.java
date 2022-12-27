package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HospitalManagement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDriver\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://automatehospital.innprofs.com/");
		/*WebElement login_btn=driver.findElement(By.xpath("//a[text()='Logins']"));
		login_btn.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println("****"+ parentWindow);
		driver.findElement(By.xpath("(//button[@class='btn btn-success btn-sm'])[3]")).click();
		Set <String> childWindow=driver.getWindowHandles();
		for (String child_Window : childWindow) {
			if(!parentWindow.equals(child_Window)) {
				//driver.switchTo().window(child_Window);
				System.out.println("switched to"+ child_Window);
		
		
		
       WebElement login_btn=w.findElement(By.xpath("//a[text()='Logins']"));
      login_btn.click();
      System.out.println("****"+ ParentWindow);
       //System.out.println("****"+ ParentWindow);
       w.findElement(By.xpath("//button[@class='btn btn-success btn-sm'])[3]")).click();
       
       
       
       Set <String> childwindow=w.getWindowHandles();
       for (String child_window : childwindow) {
    	   if(!ParentWindow.equals(child_window));
    	   //w.switchTo().window(child_window);
    	  // w.switchTo().window(child_window);
    	   System.out.println("Switched to" + child_window);
    	   
    	   
    	   
		
	}
       
       //WebElement username_txt=w.findElement(By.xpath("//input[@name='username'])"));
       //username_txt.sendKeys("admin");
       WebElement Password_txt=w.findElement(By.xpath("//input[@name='password'])"));
       Password_txt.sendKeys("Test@1234");
       WebElement adlogin_btn=w.findElement(By.xpath("//button[@name='submit'])"));
       adlogin_btn.click();
*/       
		WebElement login_btn=w.findElement(By.xpath("//a[text()='Logins']"));
		login_btn.click();
		String parentWindow=w.getWindowHandle();
		System.out.println("****"+ parentWindow);
		w.findElement(By.xpath("(//button[@class='btn btn-success btn-sm'])[3]")).click();
		Set <String> childWindow=w.getWindowHandles();
		for (String child_Window : childWindow) {
			if(!parentWindow.equals(child_Window)) {
				w.switchTo().window(child_Window);
				System.out.println("switched to"+ child_Window);
				
			}
			
			
		}
		
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(5000);
		
		//w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//WebElement username_txt = w.findElement(By.xpath("//input[@name='username']"));
		//username_txt.sendKeys("admin");
		
		
		Thread.sleep(5000);
		WebElement passwrd_txt = w.findElement(By.xpath("//input[@name='password']"));
		passwrd_txt.sendKeys("Test@12345");
		Thread.sleep(2000);
		WebElement adlogin_btn = w.findElement(By.xpath("//button[@name='submit']"));
		adlogin_btn.click();
		System.out.println("Hi");
		
		
		
		
		

	}

}

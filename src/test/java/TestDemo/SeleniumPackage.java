package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SeleniumPackage {
	WebDriver w;
	
	@BeforeSuite
	public void LaunchDriver() {
		//w=new ChromeDriver();
		System.out.println("@BeforeSuite");
	}
		
		
		@Test
		public void openApplication() {
			//w.get("https://www.google.com/");
			System.out.println("@Test");
		}
			
			
			@AfterSuite
			public void methodc() {
				System.out.println("@AfterSuite");
			}
		}

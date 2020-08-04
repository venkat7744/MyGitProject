package BDD.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParalleltestingInChrome {
	
	public WebDriver driver;
	
	@BeforeClass
	public void getbChorme(){
                //System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		  System.setProperty("webdriver.chrome.driver", "D://Softwares//FirefoxDriver//chromedriver_win32//chromedriver.exe");
		  System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		  driver = new ChromeDriver();
	}
	@Test
	public void gmail() {
		driver.get("https://www.gmail.com/");
		//driver.close();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dependsOnMethods = {"gmail"})
	public void faceBook() {
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority = 0)
	public void testing() {
		System.out.println("Test Cases passed");
	}
}

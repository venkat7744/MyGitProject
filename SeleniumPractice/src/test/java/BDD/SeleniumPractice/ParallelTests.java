package BDD.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTests {
	
	@Test
	public void getaIe() throws InterruptedException{
                //System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");
		System.setProperty("webdriver.ie.driver", "D://Softwares//FirefoxDriver//IEDriverServer_x64_3.150.1//IEDriverServer.exe");
                System.out.println("GetIe Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new InternetExplorerDriver();
		Thread.sleep(6000);
		driver.get("https://www.google.com/");
		driver.close();
	}
	
	@Test
	public void getbChorme(){
                //System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		  System.setProperty("webdriver.chrome.driver", "D://Softwares//FirefoxDriver//chromedriver_win32//chromedriver.exe");
		  System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.google.com/");
		driver.close();
	}

}
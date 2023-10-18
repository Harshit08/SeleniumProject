package ui;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ChromeB {
	WebDriver driver=null;
	@Test(priority=0)
    public void instantiationFunc() throws InterruptedException {
   
	System.setProperty("webdriver.chrome.driver","chromedriver_win32\\chromedriver.exe");  
	  driver=new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // driver.get("https://www.flipkart.com/");
	  System.out.println("ChromeB webdriver initiate");
     //return driver;
	 }
@Test(priority=1)

    public void printSomethingFunc() {
    	System.out.println("ChromeB successfully launched");
    }
  @Test(priority=2) 
    public void closeDriverFunc() throws InterruptedException {
    	
    	driver.close();
    	System.out.println("ChromeB driver successfully closed ");
    	
    }
@Test(priority=3)
    public void Test() throws InterruptedException {
	instantiationFunc();
	printSomethingFunc();
	closeDriverFunc();
	}


}

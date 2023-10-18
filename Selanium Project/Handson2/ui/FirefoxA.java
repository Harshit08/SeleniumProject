package ui;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxA {
	WebDriver driver=null;
	@Test(priority=0)
    public void instantiationFunc() throws InterruptedException {
   
	System.setProperty("webdriver.gecko.driver","geckodriver-v0.21.0-win64\\geckodriver.exe");  
	//WebDriver driver=new ChromeDriver();
	  driver = new FirefoxDriver();
      driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //driver.get("https://www.flipkart.com/");
	  System.out.println("FirefoxA webdriver initiate");
    // return driver;
	 }
@Test(priority=1)

    public void printSomethingFunc() {
    	System.out.println("FirefoxA successfully launched");
    }
  @Test(priority=2) 
    public void closeDriverFunc() throws InterruptedException {
    	
    	driver.close();
    	System.out.println("FirefoxA driver successfully closed ");
    
    }
@Test(priority=3)
    public void Test() throws InterruptedException {
	instantiationFunc();
	printSomethingFunc();
	closeDriverFunc();
	}

}

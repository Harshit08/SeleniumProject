package Testing1GroupID.Testing1ArtifactId;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
//        System.setProperty("webdriver.chrome.driver","D:\\WindowDrive1\\JavaTesting\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(600);
    }
}

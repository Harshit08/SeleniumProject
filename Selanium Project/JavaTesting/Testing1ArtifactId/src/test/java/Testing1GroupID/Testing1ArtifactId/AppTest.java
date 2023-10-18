package Testing1GroupID.Testing1ArtifactId;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppTest {
	  public static void main(String[] args) throws InterruptedException { 
	        System.out.println( "Hello World!" );
//	        System.setProperty("webdriver.chrome.driver","D:\\WindowDrive1\\JavaTesting\\chromedriver_win32\\chromedriver.exe");  
			WebDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().deleteAllCookies();
			  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.get("https://www.flipkart.com/");
			  Thread.sleep(600);
			  Thread.sleep(600);
			  WebElement phone,password,search;
			  //To go in parent window we use /../..//input
			  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
			  System.out.print("Enter your phone.no ");
			  String a= sc.next();
//			  System.out.print("Enter your pasword ");
//			  String b= sc.next();
			  
//			  phone=driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/../..//input"));
			  phone=driver.findElement(By.xpath("//label[text()='Enter Email/Mobile number']/../..//input"));
			  phone.sendKeys(a);
			  
			  driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
			  
			  System.out.print("Enter your pasword ");
			  String b= sc.next();
			  
			  password=driver.findElement(By.xpath("//label[text()='Enter Password']/../..//input"));
			  password.sendKeys(b);
			  
			  
			  driver.findElement(By.xpath("//span[text()='Login']/../..//button")).click();
			  //Searching smartphone
			  driver.findElement(By.className("_3704LK")).click();
			  search=driver.findElement(By.className("_3704LK"));
			  search.sendKeys("smartphone");
			  
			  Thread.sleep(600);
			  
			  driver.findElement(By.className("L0Z3Pu")).click();
			  driver.findElement(By.xpath("//option[@value='7000']")).click();
			  
			   
				Actions act=new Actions(driver);
				//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				
				 //WebElement hov1=driver.findElement(By.xpath("//div[text()='RAM']"));
				//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				 WebElement hov1=driver.findElement(By.xpath("//div[text()='6 GB & Above']"));
				//hov1.wait(900);
				  // act.moveToElement(hov1).build().perform();
				  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				act.moveToElement(hov1);
				 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
				//act.click(hov1.getText();
				// act.wait();
				 act.click().build().perform();
			  
			 //driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
			 /* WebDriverWait wait = new WebDriverWait(driver,300);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='6 GB & Above']")));
			  driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
	*/
			//  WebDriverWait wait = new WebDriverWait(driver,30);
			//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	       
			
		//hov2.click();
			  /*
			   6 GB & Above
			  //section[@class='_167Mu3 _2hbLCH']

			  //clik on plus button
			  driver.findElement(By.className("increment")).click();
			  driver.findElement(By.className("product-action")).click();
			  driver.findElement(By.className("cart-icon")).click();
			  driver.findElement(By.className("action-block")).click();
			// Locating element with text()
			  driver.findElement(By.xpath("//*[text()='Place Order']")).click();
			 
			  
			  
			//option[@value='India']
			  //selecting from option with value=India
			  driver.findElement(By.xpath("//option[@value='India']")).click();
			  driver.findElement(By.className("chkAgree")).click();
			  driver.findElement(By.xpath("//*[text()='Proceed']")).click();
			  Thread.sleep(600000);
			  WebElement a =driver.findElement(By.id("root"));
			// driver.get("document.querySelector(\"body > script:nth-child(2)\")");
			  
			 System.out.println(a.getText());
			 
			 */
				 
				 
				 
				 
				 
//		  WebElement phone,password,search;
//		  //To go in parent window we use /../..//input
//		  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
//		  System.out.print("Enter your phone.no ");
//		  String a= sc.next();
//		  System.out.print("Enter your pasword ");
//		  String b= sc.next();
//		  
//		  phone=driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']/../..//input"));
//		  phone.sendKeys(a);
//		  
//		  password=driver.findElement(By.xpath("//span[text()='Enter Password']/../..//input"));
//		  password.sendKeys(b);
//		  
//		  
//		  driver.findElement(By.xpath("//span[text()='Login']/../..//button")).click();
//		  //Searching smartphone
//		  driver.findElement(By.className("_3704LK")).click();
//		  search=driver.findElement(By.className("_3704LK"));
//		  search.sendKeys("smartphone");
//		  
//		  Thread.sleep(600);
//		  
//		  driver.findElement(By.className("L0Z3Pu")).click();
//		  driver.findElement(By.xpath("//option[@value='7000']")).click();
//		  
//		   
//			Actions act=new Actions(driver);
//			//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//			
//			 //WebElement hov1=driver.findElement(By.xpath("//div[text()='RAM']"));
//			//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//			 WebElement hov1=driver.findElement(By.xpath("//div[text()='6 GB & Above']"));
//			//hov1.wait(900);
//			  // act.moveToElement(hov1).build().perform();
//			  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//			act.moveToElement(hov1);
//			 driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
//			//act.click(hov1.getText();
//			// act.wait();
//			 act.click().build().perform();
//		  
		 //driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
		 /* WebDriverWait wait = new WebDriverWait(driver,300);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='6 GB & Above']")));
		  driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
*/
		//  WebDriverWait wait = new WebDriverWait(driver,30);
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
       
		
	//hov2.click();
		  /*
		   6 GB & Above
		  //section[@class='_167Mu3 _2hbLCH']

		  //clik on plus button
		  driver.findElement(By.className("increment")).click();
		  driver.findElement(By.className("product-action")).click();
		  driver.findElement(By.className("cart-icon")).click();
		  driver.findElement(By.className("action-block")).click();
		// Locating element with text()
		  driver.findElement(By.xpath("//*[text()='Place Order']")).click();
		 
		  
		  
		//option[@value='India']
		  //selecting from option with value=India
		  driver.findElement(By.xpath("//option[@value='India']")).click();
		  driver.findElement(By.className("chkAgree")).click();
		  driver.findElement(By.xpath("//*[text()='Proceed']")).click();
		  Thread.sleep(600000);
		  WebElement a =driver.findElement(By.id("root"));
		// driver.get("document.querySelector(\"body > script:nth-child(2)\")");
		  
		 System.out.println(a.getText());
		 
		 */
		  
}


	}

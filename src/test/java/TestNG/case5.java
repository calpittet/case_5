package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class case5 {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
	
		  
		    
	}
  @Test
  public void case5() {
	  // System.setProperty("webdriver.chrome.driver", "chromedriver");
	  System.setProperty("webdriver.gecko.driver", "geckodriver");
	  // driver = new ChromeDriver();

	  
	  FirefoxBinary firefoxBinary = new FirefoxBinary();
	  //firefoxBinary.addCommandLineOptions("--headless");
	  FirefoxOptions firefoxOptions = new FirefoxOptions();
	  firefoxOptions.setBinary(firefoxBinary);
	  FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
	  
	  
	  // Add Users
	  driver.get("http://docker.example.gov.nt.ca:3001/add.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	  

	  
	  driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[2]/input")).sendKeys("user4");
	  driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[4]/input")).sendKeys("password4");
	  driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[6]/input")).click();
	  
	  try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  // login with user
	  driver.get("http://docker.example.gov.nt.ca:3001");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	  

	  
	  driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[2]/input")).sendKeys("user4");
	  driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[4]/input")).sendKeys("password4");
	  driver.findElement(By.xpath("/html/body/form/div/div/div/div[1]/div[6]/input")).click();
	  
	  try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  
	  
	  driver.quit();
	  
  }
 
   @AfterMethod
    public void logout() {
	    //driver.close();

   }
}

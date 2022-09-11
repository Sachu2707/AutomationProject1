import org.testng.annotations.Test;

import pageobjects.UserPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AutomationProj extends UserPage {
	
	public WebDriver driver;
	public String filepath=System.getProperty("user.dir");
	public String url=null;
	 private UserPage user = new UserPage();
	 
  @Test(dataProvider = "dp",priority = 1, groups = { "smoke" })
  public void Tc_01(String username, String password) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id(txt_UserName)).sendKeys(username);
	  driver.findElement(By.id(txt_pwd)).sendKeys(password);
	  driver.findElement(By.id(txt_Sigin)).click();
	  Thread.sleep(3000);
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("My account"));
	  driver.findElement(By.id(txt_Searchbox)).sendKeys("Printed Chiffon Dress");
	  driver.findElement(By.xpath(txt_Searchbutton_xpath)).click();
	  Thread.sleep(2000);
	  
	  WebElement ele = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"));
	  //Creating object of an Actions class
	  Actions action = new Actions(driver);

	  //Performing the mouse hover action on the target element.
	  action.moveToElement(ele).perform();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(txt_Searchitem1_xpath)).click();
	  System.out.println(driver.findElement(By.xpath(txt_Searchitem1_text_xpath)).getText());
	  driver.findElement(By.xpath(txt_Searchitem1_text_xpath)).getText();
	  System.out.println(driver.findElement(By.xpath(txt_Successmsg_xpath)).getText());
//	  Assert.assertTrue(driver.findElement(By.xpath(txt_Successmsg_xpath)).getText().contains("Product successfully added"));
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(get_txt_Searcitem1_proceedtocheckout_xpath())).click();
	  driver.close();
  }
    
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Hakhilesh.chinnu@gmail.com", "Chinnu123" },
    };
  }
  @BeforeClass
  public void beforeClass() {
      System.setProperty("webdriver.chrome.driver", filepath+"\\Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(url);
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  url="http://automationpractice.com/index.php?controller=authentication";
  }

  @AfterSuite
  public void afterSuite() {
  }

}

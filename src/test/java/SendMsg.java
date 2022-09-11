
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

public class SendMsg extends UserPage {
	public WebDriver driver;
	public String filepath=System.getProperty("user.dir");
	public String url=null;
	 private UserPage user = new UserPage();
	 
  @Test(dataProvider = "automation",priority = 1, groups = { "regression" })
  public void Tc_01(String name, String email) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(txt_Contacts)).click();
	  System.out.println(driver.getTitle());
	  Assert.assertTrue(driver.getTitle().contains("Contact"));
	  
	  driver.findElement(By.id(txt_Contacts_Name)).sendKeys(name);
	  driver.findElement(By.id(txt_Contacts_Email)).sendKeys(email);
	  driver.findElement(By.id(txt_Contacts_Comment)).sendKeys("Text");
	  
	  driver.findElement(By.xpath(txt_Contacts_Submit_xpath)).click();
	  Thread.sleep(1000);
	  Assert.assertTrue( driver.findElement(By.xpath(txt_Contacts_SuccessMsg)).isDisplayed());
	  driver.close();
  }
   
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] automation() {
    return new Object[][] {
      new Object[] { "Sample", "Sample@sample.com" },
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
	  url="https://automationpanda.com/";
  }

  @AfterSuite
  public void afterSuite() {
  }

}

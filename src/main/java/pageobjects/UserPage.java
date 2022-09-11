package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class UserPage {
	
    public String txt_Speaking="//a[text()='Speaking']";
    public String txt_image="//img[@class='attachment-post-thumbnail size-post-thumbnail wp-post-image']";
    public String txt_Books="//a[text()='Books']";
    public String txt_Contacts="//a[text()='Contact']";
    public String txt_Contacts_Name="g3-name";
    public String txt_Contacts_Email="g3-email";
    public String txt_Contacts_Comment="contact-form-comment-g3-comment";
    public String txt_Contacts_Submit_xpath="//button[@class='pushbutton-wide']";
    public String txt_Contacts_SuccessMsg="//div[@id='contact-form-3']/h3";
  

}

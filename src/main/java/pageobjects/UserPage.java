package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class UserPage {
	
    public String txt_UserName="email";
    public String txt_pwd="passwd";
    public String txt_Sigin="SubmitLogin";
    public String txt_Searchbox="search_query_top";
    public String txt_Searchbutton_xpath="//button[@name='submit_search']";
    public String txt_Searchitem1_xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]";
    public String txt_Searchitem1_text_xpath="(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]/parent::div//preceding-sibling::h5";
    public String txt_Successmsg_xpath="//div[@class='layer_cart_product col-xs-12 col-md-6']/h2";
    public String txt_proceedtocheckout_xpath="//a[@class='btn btn-default button button-medium']";
    public String txt_forgetpwd_xpath="//a[text()='Forgot your password?']";
    public String txt_retrievpwd_xpath="//button[@class='btn btn-default button button-medium']";
    public String txt_alertmsg_xpath="//p[@class='alert alert-success']";
    
    public String get_txt_UserName() {
    	return txt_UserName;
    }
    
    public String get_txt_Password() {
    	return txt_pwd;
    }
    
    public String get_txt_Signin() {
    	return txt_Sigin;
    }

    public String get_txt_Searchbox() {
    	return txt_Searchbox;
    }
    
    public String get_txt_Searchbtn_xpath() {
    	return txt_Searchbutton_xpath;
    }
    
    public String get_txt_Searcitem1_xpath() {
    	return txt_Searchitem1_xpath;
    }
    
    public String get_txt_Searcitem1_text_xpath() {
    	return txt_Searchitem1_text_xpath;
    }
    
    public String get_txt_Searcitem1_successmsg_xpath() {
    	return txt_Successmsg_xpath;
    }
    
    public String get_txt_Searcitem1_proceedtocheckout_xpath() {
    	return txt_proceedtocheckout_xpath;
    }
    
    public String get_txt_forgetpwd_xpath() {
    	return txt_forgetpwd_xpath;
    }
    
    public String get_txt_retrievepwd_xpath() {
    	return txt_retrievpwd_xpath;
    }
    
    public String get_txt_alertmsg_xpath() {
    	return txt_alertmsg_xpath;
    }

}

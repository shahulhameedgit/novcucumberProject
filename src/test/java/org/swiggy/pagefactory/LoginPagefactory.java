package org.swiggy.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.swiggy.baseclass.Seleniumday1;

public class LoginPagefactory extends Seleniumday1 {
	
	// thsi is newly added line
	
	public LoginPagefactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Sign up']")
	public WebElement signupbutton;
	
	@FindBy(id="mobile")
	public WebElement phonenumber;
	
	@FindBy(xpath = "//a[@class='a-ayg']")
	public WebElement continubutton;
	
	@FindBy(xpath="//label[@for='mobile']")
	public WebElement labeldatafrophone;
	

	
	
	public String phoneLabelDataRead() {
		WebElement phoneLabelData = labeldatafrophone;
		String text = phoneLabelData.getText();
		return text;
	}
	
}

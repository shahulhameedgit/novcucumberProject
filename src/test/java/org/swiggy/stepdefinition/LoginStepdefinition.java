package org.swiggy.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.swiggy.baseclass.Seleniumday1;
import org.swiggy.pagefactory.LoginPagefactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition extends Seleniumday1{
	
	@Given("Open the swiggy url in chrome.")
	public void Open_the_swiggy_url_in_chrome() {
		browserlaunch("chrome");
		loadUrl("https://www.swiggy.com/");
	}
	
	@And("select the Sign up button for registration")
	public void click_sign_up() {
		LoginPagefactory lp= new LoginPagefactory();
		elementClick(lp.signupbutton);
	}
	
	@When("Find the phone number field and Enter the data {string}")
	public void find_the_phone_number_field_and_enter_the_data(String phonenu) {
		LoginPagefactory lp= new LoginPagefactory();
		type(lp.phonenumber, phonenu);
	}
	
	@When("click on continue button")
	public void click_on_continue_button() {
		LoginPagefactory lp= new LoginPagefactory();
		elementClick(lp.continubutton);
	}
	
	@Then("check the phone number text box label is showing {string}")
	public void check_the_phone_number_text_box_label_is_showing(String label) {
		
		LoginPagefactory lp= new LoginPagefactory();
		String labeldatafrophone = lp.labeldatafrophone.getText();
		Assert.assertTrue("both the label are not same", labeldatafrophone.equals(label));
	}
	
	
	@When("Find the phone number field and Enter the data")
	public void find_the_phone_number_field_and_enter_the_data(DataTable dataTable) {
	    List<String> asList = dataTable.asList();
		LoginPagefactory lp= new LoginPagefactory();
		type(lp.phonenumber, asList.get(1));
	}
	
	@Then("check the phone number text box label is showing")
	public void validation(DataTable data) {
		//considering the data as list of list
//		List<List<String>> asLists = data.asLists();
//		LoginPagefactory lp= new LoginPagefactory();
//		String labeldatafrophone = lp.labeldatafrophone.getText();
//		Assert.assertTrue("both the label are not same", labeldatafrophone.equals(asLists.get(0).get(1)));
//	
//		Map<String, String> asMap = data.asMap(String.class, String.class);
//		LoginPagefactory lp= new LoginPagefactory();
//		String labeldatafrophone = lp.labeldatafrophone.getText();
//		Assert.assertTrue("both the label are not same", labeldatafrophone.equals(asMap.get("Phone number")));
	
		List<Map<String, String>> asMaps = data.asMaps();
		LoginPagefactory lp= new LoginPagefactory();
		String labeldatafrophone = lp.labeldatafrophone.getText();
//		Assert.assertTrue("both the label are not same", labeldatafrophone.equals(asMaps.get(1).get("invalid")));
	}

}


package org.cucum;

import org.km.baseclass;
import org.sam.Fbloginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumberex extends baseclass {
	Fbloginpojo f;
	@Given("user has to launch the browser and maximise the window")
	public void user_has_to_launch_the_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("user has to hits the facebook url")
	public void user_has_to_hits_the_facebook_url() {
	  launchUrl("https://www.facebook.com/");
	}

	@When("user has to pass the data {string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String eml) {
	    f= new Fbloginpojo();
	    passText(eml, f.getEmail());
	}

	@When("user has to pass the data {string}in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
	   f = new Fbloginpojo();
	   passText(pass, f.getPassword());
	}

	@When("user has to click the login btn")
	public void user_has_to_click_the_login_btn() {
		f=new Fbloginpojo();
	   clickBtn(f.getLoginBtn());
	}

	@Then("user has to close the browser")
	public void user_has_to_close_the_browser() {
	   closeEntireBrowser();
	}


	
}

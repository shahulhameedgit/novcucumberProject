package org.swiggy.stepdefinition;

import java.util.Date;

import org.swiggy.baseclass.Seleniumday1;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Seleniumday1{
	
	@Before("@sanity")
	public void beforescenario() {
		System.out.println(new Date());
	}
	
	@Before("@smoke")
	public void beforesmoke() {
		System.out.println("smoke");
	}
	
	
	@After
	public void afterscenario() {
		driver.quit();
	}
	
}

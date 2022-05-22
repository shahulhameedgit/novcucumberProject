package org.swiggy.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Feature",
				 glue="org.swiggy.stepdefinition",monochrome = true,dryRun = false
				 ,tags = "@smoke"
				 ,plugin = {"html:target/report","json:target/jsonreport"
						 ,"rerun:src/test/resources/failed/failed.txt"})

public class Runner {
	

}

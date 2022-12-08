package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
		                      "json:target/cucumber-reports/cucumber" },
                 features="C:\\workspace\\CucumberSalesForce\\resources\\SalesForceGeneric.feature",
                  
                 glue= {"com.training.steps"},
                 tags = "@smoke")
public class Runner {

}
 
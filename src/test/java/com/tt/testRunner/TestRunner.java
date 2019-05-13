package com.tt.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"Features"},
		glue= {"com.tt.steps/Login_setData"},
		tags ={"@login"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	

}

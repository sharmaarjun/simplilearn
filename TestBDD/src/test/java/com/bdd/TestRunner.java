package com.bdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Arjun Sharma\\eclipse-workspace\\TestBDD\\src\\test\\java\\LoginFeatures\\Login.feature",
		glue= {"StepDefinitions"}
		,tags= "@dataparam"
//		,tags= "@smoke and @dev" // AND
//		,tags= "@smoke or @login" // OR
//		,tags= "(@login or @regression or @param) and (not @dev)" // Complex AND + OR
		)

public class TestRunner {

}

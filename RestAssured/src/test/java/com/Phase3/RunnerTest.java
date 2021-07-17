package com.Phase3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;	

@CucumberOptions(
		glue = {"com.simplilearnTests"},
		features = "classpath:features",
		tags = "@tag1"
		)

@RunWith(Cucumber.class)
public class RunnerTest {

}

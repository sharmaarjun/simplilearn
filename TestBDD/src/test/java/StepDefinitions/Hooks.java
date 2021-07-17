package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@dev")
	public void before() {
		System.out.println("This should be executed before");
	}
	
	@After("@login")
public void after() {
		System.out.println("This should be executed after");
	}

}

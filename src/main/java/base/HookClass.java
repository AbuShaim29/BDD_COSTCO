package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	Baseclass baseClass;
	
	@Before
	public void beforeHook() {
		baseClass = new Baseclass();
		baseClass.setUpDriver();
	}
	
	@After
	public void afterHook() {
		baseClass.closingDriverSession();
	}
}



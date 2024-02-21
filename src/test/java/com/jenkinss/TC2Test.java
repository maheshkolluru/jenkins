package com.jenkinss;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC2Test {
	@Test
	public void m2()
	{
		Reporter.log("m2 updated ",true);
		Reporter.log("m3 updated ",true);
	}

}

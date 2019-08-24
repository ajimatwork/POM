package com.newtours.demoaut.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class validateLogin extends BaseTest {
@Test
public void validateLogin() {
	String expectedResult= "a";
	String actualResult= "a";
	Assert.assertEquals(actualResult, expectedResult);
}
}

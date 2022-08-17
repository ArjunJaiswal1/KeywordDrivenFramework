package com.qa.fb.keyword.tests;

import org.testng.annotations.Test;

import com.qa.fb.keyword.enginc.KeyWordEngine;

public class LoginTest {
public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}
}


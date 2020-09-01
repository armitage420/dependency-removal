package com.araika.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//Mostly not recommended because test caes should be independent of each other.
//But I wasn't sure about your requirements.
//Hence TestRunner class
public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(AllTestsSuite.class);
		
		for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful()+"\nYayy! There are no errors in main methods!");
	}

}

package com.araika.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.araika.service.LogicImplementation;

public class GetEMIDateTest {
	LogicImplementation logic = new LogicImplementation();
	@Test
	public void test() {
		//Since 10+- id allowed.Checking only whole number values
		//Taken, it's march now.
		System.out.println("This method gives the next month name after adding the integer: "+logic.getEMIDate(8));
		assertEquals("JANUARY",logic.getEMIDate(8));
	}

}

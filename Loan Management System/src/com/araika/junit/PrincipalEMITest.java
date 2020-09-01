package com.araika.junit;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.araika.service.LogicImplementation;

public class PrincipalEMITest {
	LogicImplementation logic = new LogicImplementation();
	
	@Test
	public void test() {
		//Since 10+- id allowed.Checking only whole number values
		System.out.println("The Principal EMI Amount is: "+logic.principalEMI(new BigDecimal(1000), 12));
		assertEquals(new BigDecimal(83),logic.principalEMI(new BigDecimal(1000), 12).setScale(0,BigDecimal.ROUND_HALF_EVEN));
	}

}

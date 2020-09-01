package com.araika.junit;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.araika.service.LogicImplementation;

public class TotalEMITest {
	LogicImplementation logic = new LogicImplementation();
	
	@Test
	public void test() {
		//Since 10+- id allowed.Checking only whole number values
		System.out.println("Total EMI per month: "+logic.totalEMI(new BigDecimal(1000), 12,10));
		assertEquals(new BigDecimal(93),logic.totalEMI(new BigDecimal(1000), 12,10).setScale(0,BigDecimal.ROUND_HALF_EVEN));
	}

}

package com.araika.junit;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.araika.service.LogicImplementation;

public class resultAmtTest {
	LogicImplementation logic = new LogicImplementation();
	
	@Test
	public void test() {
		//Since 10+- id allowed.Checking only whole number values
		System.out.println("Total Payable Amount Junit Test:"+ logic.resultAmt(new BigDecimal(1000), 12));
		assertEquals(new BigDecimal(1120), logic.resultAmt(new BigDecimal(1000), 12).setScale(0, BigDecimal.ROUND_HALF_EVEN));
	}

}

package com.araika.service;

import java.math.BigDecimal;
import java.time.Month;
public interface LogicInterface {
	//Total Payable Amount
	public BigDecimal resultAmt(BigDecimal principalAmt, int noOfEMIs);
	
	//Principal EMI
	public BigDecimal principalEMI(BigDecimal principalAmt, int noOfEMIs);
	
	//Total EMI
	public BigDecimal totalEMI(BigDecimal principalAmt, int noOfEMIs, int interestEMI);
	
	//Remaining Principal
	public BigDecimal remPrincipal(BigDecimal amount, BigDecimal totalEMI);
	
	//Get Date for EMI
	public String getEMIDate(int i);
	
	//Adding a default method
	public default String getMonth(int m) {
		return Month.of(m).name().toString();
	}
}

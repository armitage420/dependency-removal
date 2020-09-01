package com.araika.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.araika.pojo.Loan;

public class LogicImplementation implements LogicInterface {

	@Override
	public BigDecimal resultAmt(BigDecimal principalAmt, int noOfEMIs) {
		
		BigDecimal interest;
		//12% p.a = 0.12 p.a
		//time= noOfEMIs/12
		//Simple Interest=PRT
		interest = principalAmt.multiply(new BigDecimal((noOfEMIs*0.12)/12));
		
		return principalAmt.add(interest).setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

	@Override
	public BigDecimal principalEMI(BigDecimal principalAmt, int noOfEMIs) {
		
		return principalAmt.divide(new BigDecimal(noOfEMIs), 2, BigDecimal.ROUND_UP);
	}

	@Override
	public BigDecimal totalEMI(BigDecimal principalAmt, int noOfEMIs, int interestEMI) {
		
		//Interest EMI= Rs 10. Implied from the output maybe--??
		return principalEMI(principalAmt, noOfEMIs).add(new BigDecimal(interestEMI)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}

	@Override
	public BigDecimal remPrincipal(BigDecimal amount, BigDecimal totalEMI) {
		
		//Remaining Amount to be paid after paying the month's EMI
		return amount.subtract(totalEMI);
	}

	@Override
	public String getEMIDate(int i) {
		//Since no Data Access Object Present, so setting date here itself.
		Loan loan = new Loan();
		LocalDate date = loan.getDate();
		
		//Getting int value of Month
		int month = date.getMonthValue();
		
		//Now ultimate month for present EMI value.
		month = ((month+i)%12==0) ? 12 : ((month+i)%12);
		return getMonth(month);
	}
	
	//Method to get appropriate output
	public String toString() {
		
		return null;
	}
}

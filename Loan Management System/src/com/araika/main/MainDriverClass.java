package com.araika.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import com.araika.pojo.Loan;
import com.araika.service.LogicImplementation;

public class MainDriverClass {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the Principal Amt. and number of months for EMI, seperated by space: ");
		Scanner sc = new Scanner(System.in);
		
		//taking input. No comma in between--??
		// and no need of the term 'month' maybe--??
		BigDecimal principalAmt = sc.nextBigDecimal();
		int noOfEMIs = sc.nextInt();
		sc.close();
		
		//System.out.println("Rs."+principalAmt+" "+noOfEMIs+" months");
		
		//Now Derived variables
		LocalDate date;
		BigDecimal totalAmtPayable, principalEMI, totalEMI,remPrincipal;
		//Did not really understand how EMI interest rupees was calculated --?? hence adding Rs 10.
		//No special dependency so formula can be changed
		int interestEMI=10;
		
		Loan loan = new Loan();
		date = loan.getDate();
		
		LogicImplementation logic = new LogicImplementation();
		totalAmtPayable = logic.resultAmt(principalAmt, noOfEMIs);
		principalEMI = logic.principalEMI(principalAmt, noOfEMIs);
		totalEMI = logic.totalEMI(principalAmt, noOfEMIs, interestEMI);
		
		System.out.println("1. Loan creation date : "+date.getDayOfMonth()+"th "+logic.getMonth(date.getMonthValue())+" "+date.getYear());
		System.out.println("2. Principal Amount : "+principalAmt);
		System.out.println("3. No Of EMI’s : "+noOfEMIs);
		System.out.println("4. Total payable amount : "+totalAmtPayable);
		System.out.println("5. EMI Details : ");
		
		remPrincipal=totalAmtPayable;
		//EMI Details loop
		//not using a,b,c and using bullets, in case scenarios where No of EMIs are more than 26.
		for(int i=1; i<=noOfEMIs; i++) {
			remPrincipal=remPrincipal.subtract(totalEMI).setScale(2, BigDecimal.ROUND_HALF_EVEN);
			System.out.println("\t\u2022 EMI No : "+i+", Principal EMI : "+principalEMI+", Interest EMI = "+interestEMI+", Total EMI = "+totalEMI+", EMI Date : "+date.getDayOfMonth()+"th "+logic.getEMIDate(date.getMonthValue()+i)+" "+date.getYear()+", Principal remaining : "+remPrincipal);
		}
	}

}

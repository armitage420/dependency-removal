package com.araika.pojo;
import java.math.BigDecimal;
import java.time.LocalDate;
//High-Level Module.
public class Loan {
	
	//Depended on EMI hence removed all the variables that could be derived.
	
	/*using Bigdecimal datatype for principal amount or any other values representing
	 * money as it's precision value is arbitrary unlike in double. 
	 */
	private BigDecimal principalAmt;
	private LocalDate date;
	private int noOfEMIs;
	
	//No-arg Constructor
	public Loan() {}
	
	//Getters
	public BigDecimal getPrincipalAmt() {
		return principalAmt;
	}
	public LocalDate getDate() {
		
		this.date=LocalDate.now();
		return date;
	}
	public int getNoOfEMIs() {
		return noOfEMIs;
	}
	
	//Setters
	public void setPrincipalAmt(BigDecimal principalAmt) {
		this.principalAmt = principalAmt;
	}
	
	public void setNoOfEMIs(int noOfEMIs) {
		this.noOfEMIs = noOfEMIs;
	}
	
	
}

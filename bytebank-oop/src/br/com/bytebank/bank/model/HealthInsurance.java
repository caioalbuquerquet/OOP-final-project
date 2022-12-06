package br.com.bytebank.bank.model;


public class HealthInsurance implements Taxable {

	@Override
	public double getTaxAmount() {
		return 42;
	}

}

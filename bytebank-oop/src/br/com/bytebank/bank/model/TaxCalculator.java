package br.com.bytebank.bank.model;

///br.com.bytebank.bank.model.TaxCalculator => FQN FullQualifiedName
public class TaxCalculator {
	
	private double totalTax;
	
	public void register(Taxable t) {
		double amount = t.getTaxAmount();
		this.totalTax += amount;
		
	}
	
	public double getTotalTax() {
		return totalTax;
	}
}

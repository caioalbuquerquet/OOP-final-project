package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;


public class TaxableTest {
	public static void main(String[] args) {
		CheckingAccount cc = new CheckingAccount(2222, 3332);
		cc.deposit(100.0);
		
		
		HealthInsurance insurance = new HealthInsurance();
		
		TaxCalculator calc = new TaxCalculator();
		calc.register(cc);
		calc.register(insurance);
		
		System.out.println(calc.getTotalTax());
	}
}

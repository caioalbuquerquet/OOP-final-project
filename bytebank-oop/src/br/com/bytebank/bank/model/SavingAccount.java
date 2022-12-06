package br.com.bytebank.bank.model;


public class SavingAccount extends Account{
	
	public SavingAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public void deposit(double amount) {
		super.balance += amount;

	}
}

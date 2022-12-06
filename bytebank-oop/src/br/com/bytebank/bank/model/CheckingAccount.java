package br.com.bytebank.bank.model;


public class CheckingAccount extends Account implements Taxable {

	public CheckingAccount(int agency, int number) {
		super(agency, number);
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientBalanceException{
		double amountToWithdraw = amount + 0.2;
		super.withdraw(amountToWithdraw);
	}

	@Override
	public void deposit(double amount) {
		super.balance += amount;
		
	}

	@Override
	public double getTaxAmount() {
		return super.balance * 0.01;
	}
}

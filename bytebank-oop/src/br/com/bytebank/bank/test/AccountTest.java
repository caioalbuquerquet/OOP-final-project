package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CheckingAccount;
import br.com.bytebank.bank.model.InsufficientBalanceException;
import br.com.bytebank.bank.model.SavingAccount;

public class AccountTest {

	
	
	public static void main(String[] args) throws InsufficientBalanceException{
		
		
		//Full Qualified Name FQN
		CheckingAccount checkingAccount = new CheckingAccount(111, 111);
		checkingAccount.deposit(100.0);
		
		
		

		SavingAccount savingAccount = new SavingAccount(113, 112);
		savingAccount.deposit(200.0);
		
		checkingAccount.transfer(10, savingAccount);	
		
		System.out.println("Balance in the checking account " + "$" + checkingAccount.getBalance());
		System.out.println("Balance in the saving account " + "$" + savingAccount.getBalance());
		
		
		
	}
}

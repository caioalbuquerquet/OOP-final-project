package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CheckingAccount;


public class WithdrawTeste {

	public static void main(String[] args) {
		Account account = new CheckingAccount(123, 321);
		
		account.deposit(200);
		
		try {
			account.withdraw(210);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(account.getBalance());
	}

}

package br.com.bytebank.bank.model;

/**
 * 
 * Class representing an account 
 * 
 * @author Caio Albuquerque
 * @version 1.0
 */


public abstract class Account {

	protected double balance;
	private int agency;
	private int number;
	private Customer holder;
	private static int total = 0;


	/**
	 * Constructor to initialize the account object from the agency and number
	 * @param agency
	 * @param number
	 */
	
	public Account(int agency, int number) {
		Account.total++;
		this.agency = agency;
		this.number = number;
	}
	
	public abstract void deposit(double amount);
	
	
	/**
	 * The amount needs to be greater than the balance.
	 * @param amount
	 * @throws InsufficientBalanceException
	 */
	public void withdraw(double amount) throws InsufficientBalanceException{
		
		if (this.balance < amount) {
			throw new InsufficientBalanceException("Ex: Balance: " + this.balance + ", Amount: " + amount);
		}
		this.balance -= amount;
	}
	
	public void transfer(double amount, Account destination) throws InsufficientBalanceException {
		this.withdraw(amount);
		destination.deposit(amount);
	}		
			

	public double getBalance() {
		return this.balance;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("Cannot have an amount less than 0");
			return;
		}
		this.number = number;
	}

	public int getAgency() {
		return this.agency;
	}

	public void setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("Cannot have an amount less than 0");
			return;
		}
		this.agency = agency;
	}

	public void setHolder(Customer holder) {
		this.holder = holder;
	}

	public Customer getHolder() {
		return this.holder;
	}

	public static int getTotal() {
		return Account.total;
	}

}
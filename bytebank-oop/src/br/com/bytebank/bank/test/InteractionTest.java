package br.com.bytebank.bank.test;

import java.util.Scanner;
import br.com.bytebank.bank.model.*;

public class InteractionTest {
	
	

	public static void main(String[] args) throws InsufficientBalanceException {
		
		Scanner scanner = new Scanner(System.in);
		Customer caio = new Customer();
		CheckingAccount ca = new CheckingAccount(123, 123456);
		
		System.out.println("Enter your full name, please: ");
		String customerName = scanner.nextLine();
		
		
		caio.setName(customerName);
		
//		System.out.println(caio.getName());

		System.out.println("Enter your PESEL number, please: ");
//		int customerPesel = scanner.nextInt();
		
		caio.setPesel(scanner.nextInt());
		
		//System.out.println(caio.getPesel());
		
		createAccount();
		
		System.out.println("This is your account agency " + ca.getAgency());
		System.out.println("And this is your account number " + ca.getNumber());
		
		System.out.println("Add money to your account: ");
		ca.deposit(scanner.nextDouble());
		
//		System.out.println(ca.getBalance());
		
		System.out.println("Now that you have money in your account, "
				+ "you are able to withdraw! Type how much you want to withdraw: ");
		ca.withdraw(scanner.nextDouble());

		scanner.close();
		
		
	}

		
		
		public static void createAccount() {
		System.out.println("Thank you, now you are part of ByteBank");
		System.out.println();
		System.out.println("Now we are creating your account.");
		System.out.println();
		System.out.println("Done! You have an account.");
		}
		
		
		
		
		
		

	}



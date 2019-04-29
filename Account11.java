
/*
 * Use exercise 9.7 as a model:
 * 
 * Account class was defined to model a bank account. An Account has the properties:
 * 
 * 1. account number
 * 2. balance
 * 3. annual interest rate
 * 4. date created and methods
 * 
 * Subclasses:
 * 1. Checking account: cannot be overdrawn
 * 2. Savings account: overdraft limit
 * 
 * Test class:
 * creates objects of account, Savingsaccount, CheckingAccount
 */

import java.util.Scanner;

public class Account11 extends Object{
	
	private int identification;
	private double balance;
	private double annualInterestRate =0;
	
	Account11(){
		
		Scanner acc= new Scanner(System.in);
		System.out.println("Enter id number: ");
		this.identification= acc.nextInt();
		System.out.println("Enter initial balance: ");
		this.balance= acc.nextDouble();
		System.out.println("Enter annual interest rate: ");
		this.annualInterestRate= acc.nextDouble();
	}

	public double getBalance() {
		return balance;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100)/12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	public double deposit(int amount) { 
		return balance + amount;
	}
	public double withdraw (double sub) {
		return balance - sub;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The balance after withdrawal is: "+ balance;
	}


}


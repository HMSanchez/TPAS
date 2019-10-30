//Harrisen Sanchez
//2/10/17
package app;

public class Account {

	public static enum TYPE { Checking, Savings}
	private String name;
	private TYPE type;
	private double balance;
	
	
	public Account(String name, TYPE type, double balance){
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	
	public String toString(){
		return "Account Name: " + name + ", " + "Type: " + type + ", " + "Balance: " + balance;
	}
	
	
	
	
	
}
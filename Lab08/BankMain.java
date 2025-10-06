package lab08;

public class BankMain {
	public static void main(String[] args) { 
		  // TODO Auto-generated method stub 
		  Bank bank = new Bank(); 
		 
		        bank.createAccount(1000009, 4000); 
		        bank.createAccount(1000008, 2000); 
		        bank.deposit(1000009, 2500); 
		        bank.withdraw(1000008, 1000); 
		 
		        System.out.println("Final balances:"); 
		        bank.checkBalance(1000009); 
		        bank.checkBalance(1000008); 
		    } 
		 
		 }



package bank_account;

public class Program {
	
	public static void main (String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(100, 23);
		
		
		System.out.println(account2.getChecking());
	}
	
	
	
	
}

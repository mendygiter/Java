package bank_account;

import java.util.Random;

public class BankAccount {
	
	private static int numAccounts=0;
	private static double totalMoney = 0.0D;
	
	
	private double checking;
	private double savings;
//	private Long id;

	
	public BankAccount () {
		this.checking = 0;
		this.savings = 0;
//		this.id = genId();
		numAccounts++;
	}
	
	public BankAccount(double checking, double savings) {
		this.checking = checking;
		this.savings = savings;
		numAccounts++;
		totalMoney += checking+savings;	
	}
	
	public void Deposit(Double amount, Boolean accountType) {
		if(accountType) {
			savings += amount;
		}
			
		else {
			checking += amount;
		}
		
			totalMoney += amount;
	}
	
	public double Withdraw(Double amount, Boolean accountType) {
		
		if((checking-amount) <0 || (savings-amount) <0) return 0;
		
		
		if(accountType) {
			savings -= amount;
		}
			
		else {
			checking -= amount;
		}
		
			return amount;
	}
	
	public double getTotal() {
		
		return checking+savings;
	}
	
//	public Long genId() {
//		Long _id = 0;
//		double rnd = Math.random()
////		Long _id = (Long) (1000000000.0D + (rnd*99999999-100000000.0D));
////		Random random=new Random();
////		random.nextLong()
////		return _id;
//		
//		string _id = "";
//		for(int i=0; i<9; i++) {
//			_id += Math.floor (Math.random()*9) + "";
//		}
//		
//		return Long.parseLong(_id);
//	}
	
	
	
	
	
	
	

	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public static int getNumAccounts() {
		return numAccounts;
	}

	public static void setNumAccounts(int numAccounts) {
		BankAccount.numAccounts = numAccounts;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
}

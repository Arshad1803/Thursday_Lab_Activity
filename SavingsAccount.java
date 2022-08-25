// Program to calculate monthly interest and print the new balance of savers.

public class SavingsAccount {
	static double annualInterestRate;
	private double savingsBalance;
	
	void calculateMonthlyInterest(double annualInterest, double savingsBalance) {
		this.annualInterestRate = annualInterest;
		this.savingsBalance = savingsBalance;
		double interest = (savingsBalance * annualInterest / 12);
//		System.out.print(interest);
		savingsBalance += interest;
		System.out.println(savingsBalance);
	}
	static void modifyInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		saver1.modifyInterestRate(0.04);
		System.out.print("New Balance of savingsBalance " +saver1.savingsBalance+" at annualInterest of "+annualInterestRate+ " is: ");
		saver1.calculateMonthlyInterest(annualInterestRate, saver1.savingsBalance);
		System.out.print("New Balance of savingsBalance " +saver2.savingsBalance+" at annualInterest of "+annualInterestRate+ " is: ");
		saver2.calculateMonthlyInterest(annualInterestRate, saver2.savingsBalance);
		saver1.modifyInterestRate(0.05);
		System.out.print("New Balance of savingsBalance " +saver1.savingsBalance+" at annualInterest of "+annualInterestRate+ " is: ");
		saver1.calculateMonthlyInterest(annualInterestRate, saver1.savingsBalance);
		System.out.print("New Balance of savingsBalance " +saver2.savingsBalance+" at annualInterest of "+annualInterestRate+ " is: ");
		saver2.calculateMonthlyInterest(annualInterestRate, saver2.savingsBalance);
		

	}

}

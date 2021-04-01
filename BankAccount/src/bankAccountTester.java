import java.util.Scanner;
import java.text.DecimalFormat;

public class bankAccountTester 
{
		
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		DecimalFormat decFormat = new DecimalFormat("0.00");
		boolean run =true;
		
		//Asks for starting balance and interest amount
		System.out.print("Please enter starting balance: ");
		double startBal = in.nextDouble();
		System.out.print("Please enter an interest rate for this account: ");
		double interest = in.nextDouble();
		
		//Creates Bank Account with the provided starting balance
		bankAccount myBankAccount = new bankAccount(startBal, interest); 
		bankThreshold threshold = new bankThreshold(startBal, interest);
		System.out.print("\nPlease enter your interest threshold: ");

		while (in.hasNextDouble()) 
		{
			
			double thresholdAmount = in.nextDouble();
			threshold.interestThreshold(thresholdAmount);
			System.out.println("Your interest threshold of $" + decFormat.format(thresholdAmount) + " will be met in "+threshold.getMonths()+" months at your current rate.");
			threshold.resetMonths();
			threshold.resetBalance(startBal);
			System.out.print("Please enter your interest threshold or enter 'End' to continue to the rest of the bank functions: ");
			
		}
		in.next();
		in.nextLine();

		//Calls bankAccount to deposit money
		System.out.print("\nEnter a deposit amount: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
				
		//Calls bankAccount to withdraw money
		double currentBal = myBankAccount.getBalance();
		System.out.print("\nEnter a withdrawal amount: ");
		double withdrawAmount = in.nextDouble();
		myBankAccount.withdraw(withdrawAmount);
		if(currentBal - withdrawAmount != myBankAccount.getBalance())
		{
			double newWithdrawAmount;
			do
			{
				System.out.print("\nEnter a withdrawal amount: ");
				newWithdrawAmount = in.nextDouble();
				myBankAccount.withdraw(newWithdrawAmount);
			}while(currentBal - newWithdrawAmount != myBankAccount.getBalance());
		}
				
		System.out.print("\nIf you want me to generate interest, enter 'Yes': ");
		String answer = in.next();
		if (answer.equals("Yes"))
		{
			myBankAccount.calcInterest();
		}
		
		System.out.println("\nBalance: " + myBankAccount.getBalance());
	}

}
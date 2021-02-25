import java.util.Scanner;

public class bankAccountTester 
{
		
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		//Asks for starting balance
		System.out.print("Please enter starting balance: ");
		double startBal = in.nextDouble();
		
		//Creates Bank Account with the provided starting balance
		bankAccount myBankAccount = new bankAccount(startBal);  	 
	
		//Calls bankAccount to withdraw money
		System.out.print("\nEnter a withdrawal amount: ");
		double withdrawAmount = in.nextDouble();
		myBankAccount.withdraw(withdrawAmount);
		
		//Calls bankAccount to deposit money
		System.out.print("\nEnter a deposit amount: ");
		double depositAmount = in.nextDouble();
		myBankAccount.deposit(depositAmount);
		System.out.println("\nBalance: " + myBankAccount.getBalance());
		
	}

}
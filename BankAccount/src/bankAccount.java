/**
A bank account has a balance and a mechanism for
applying interest or fees at the end of the month.
*/
public class bankAccount
{
	private double balance;
	private double interestPct;

	public bankAccount(double startBal, double interest)
	{
		balance = startBal;
		interestPct = interest;
		System.out.print("\tCreated new account " + startBal + " balance and interest rate " + interest);
	}

	/**
   	Makes a deposit into this account.
   	@param amount the amount of the deposit
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.print("\tDeposited: " + amount);
	}

	/**
   	Makes a withdrawal from this account, or charges a penalty if
   	sufficient funds are not available.
   	@param amount the amount of the withdrawal
	 */
	public void withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance = balance - amount;
			System.out.print("\tWithdrew: " + amount);
		}
		else
		{
			System.out.print("\tInsufficient Funds to support withdrawal");
		}
		
	}
	/**
	 Calculate the interest for the BankAccount.
	 */
	public void calcInterest()
	{
		double interestAmt = balance*interestPct;
		System.out.print("\tInterest: " + interestAmt);
		balance = balance + interestAmt;
	}
	/**
   		Gets the current balance of this bank account.
   		@return the current balance
	*/
	public double getBalance()
	{
		return balance;
	}
}


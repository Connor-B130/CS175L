
public class bankThreshold 

{
	 private double balance;
	 private double interestPct;
	 private double threshold;
	 private int months = 0;
	 
	 public bankThreshold(double startBal ,double interest)
	 {
		 balance = startBal;
	     interestPct = interest;

	 }
	 public void interestThreshold(double threshold)
	 {
		 threshold = threshold;
		 while (balance <= threshold)
		 {
			 double intAmt = balance * interestPct;
			 balance = balance + intAmt;
			 months++;
		 }
			
	 }
	 public int getMonths() 
	 {
		 return months;
	 }
	 public void resetMonths() 
	 {
		 months = 0;
	 }
	 public void resetBalance(double startBal) 
	 {
		 balance = startBal;
	 }
}
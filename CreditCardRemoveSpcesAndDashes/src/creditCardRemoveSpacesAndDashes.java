import java.util.Scanner;

public class creditCardRemoveSpacesAndDashes 
{

	public static void main(String[] args) 
	{
		boolean run = true;
		while(run) 
		{
			
			System.out.println("Please enter a credit card number or -99 to end: ");
			Scanner in = new Scanner (System.in);
			String creditNumber = in.nextLine();
			if (creditNumber.equals("-99"))
			{
				run = false;
				System.out.println("Goodbye!");
			}
			else 
			{
				creditNumber = creditNumber.replaceAll(" ","");
				creditNumber = creditNumber.replaceAll("-", "");
				System.out.println(creditNumber);
			}
		} 
	}

}

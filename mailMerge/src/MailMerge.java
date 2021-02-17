import java.util.Scanner;

public class MailMerge {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		//Declaring the variables that will be used
		String replaceText1 = "Dear <firstName> <lastName>,";
		String replaceText2 = "Please confirm your adress is <houseNumber> <street>.";
		String replaceText3 = "Your answer is: <yORn> Goodbye!";
		String promptText1 = "Please enter your first name: ";
		String promptText2 = "Please enter your last name: ";
		String promptText3 = "Please enter your house number: ";
		String promptText4 = "Please enter your street: ";
		String promptText5 = "Is this address correct? ";
		
		String firstName, lastName, houseNum, street, answer;
		
		//Obtaining information that the user inputs
		System.out.print(promptText1);
		firstName = in.nextLine();
		System.out.print(promptText2);
		lastName = in.nextLine();
		System.out.print(promptText3);
		houseNum = in.nextLine();
		System.out.print(promptText4);
		street = in.nextLine();
		
		//Replacing text for the information that was inputted
		replaceText1 = replaceText1.replace("<firstName>", firstName);
		replaceText1 = replaceText1.replace("<lastName>", lastName);
		replaceText2 = replaceText2.replace("<houseNumber>", houseNum);
		replaceText2 = replaceText2.replace("<street>", street);
		
		//Making sure data is correct
		System.out.println(replaceText1);
		System.out.println(replaceText2);
		System.out.print(promptText5);
		answer = in.nextLine();
		
		replaceText3 = replaceText3.replace("<yORn>", answer);

		System.out.println(replaceText3);
	}

}

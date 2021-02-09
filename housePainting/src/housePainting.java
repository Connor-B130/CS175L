import java.util.Scanner;

public class housePainting {

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	int len = 0;
	int wid = 0;
	int hei = 0;
	double costPerSqft = 0;
	System.out.print("Please enter the cost per square foot: ");
	costPerSqft = in.nextInt();
	System.out.print("Please enter the length of the house: ");
	len = in.nextInt();
	System.out.print("Please enter the width of the house: ");
	wid = in.nextInt();
	System.out.print("Please enter the height of the house: ");
	hei = in.nextInt();
	int normSide = len*wid;
	double peakSide = (len*wid)+(.5*(len*(hei-wid)));
	int numWin = 0;
	int lenWin = 0;
	int widWin = 0;
	System.out.print("Please enter the number of windows: ");
	numWin = in.nextInt();
	System.out.print("Please enter the length of the window: ");
	lenWin = in.nextInt();
	System.out.print("Please enter the width of the window: ");
	widWin = in.nextInt();
	int winSA = widWin*lenWin;
	int numDoor = 0;
	int lenDoor = 0;
	int widDoor = 0;
	System.out.print("Please enter the number of doors: ");
	numDoor = in.nextInt();
	System.out.print("Please enter the length of the door: ");
	lenDoor = in.nextInt();
	System.out.print("Please enter the width of the door: ");
	widDoor = in.nextInt();
	int doorSA = lenDoor*widDoor;
	int totalWin = numWin*winSA;
	int totalDoor = numDoor*doorSA;
	double totalSA = ((normSide*2)+(peakSide*2))-(totalWin+totalDoor);
	double totalCost = totalSA*costPerSqft;
	System.out.print("Your total paintable surface area is ");
	System.out.print(totalSA);
	System.out.println(" square feet.");
	System.out.print("Your estimate is ");
	System.out.print(totalCost);
	System.out.print(" dollars");
	}

}

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RoachSimulation 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		
		String input = JOptionPane.showInputDialog("Enter starting roach population: ");
		double startPop = Double.parseDouble(input);
		
		RoachPopulation bugs = new RoachPopulation(startPop);
		DecimalFormat wholeFormat = new DecimalFormat("0");
		JOptionPane.showMessageDialog(null,  "The initial roach population is " + wholeFormat.format(bugs.getRoachPopulation()));
		
		double sprayPct = 1;
		for(int i = 1; i < 5; i++)
		{
			bugs.breed();
			JOptionPane.showMessageDialog(null,  "The Roach Population after cycle " + i + " breeding is " + wholeFormat.format(bugs.getRoachPopulation()));
			if (i == 1) 
			{
				String inputTwo = JOptionPane.showInputDialog("Enter spray percent: ");
				sprayPct = Double.parseDouble(inputTwo);
			
			}
			bugs.spray(sprayPct);
			JOptionPane.showMessageDialog(null,  "The Roach Population after cycle " + i + " " + (sprayPct*100) + "% spraying is " + wholeFormat.format(bugs.getRoachPopulation()));
			sprayPct = sprayPct + .1;
		}
		
	}

}
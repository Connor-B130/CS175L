import javax.swing.JOptionPane;

public class romanNumeralConverter 
{

	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("Enter a year:");
		int date = Integer.parseInt(input);
		
		String romanNumeral = "";
		
		int year = date/1%10;
		int dec = date/10%10;
		int cent = date/100%10;
		int mill = date / 1000%10;
		
		if (date > 0 && date <= 3999) 
		{
				while (mill > 0) 
				{
					romanNumeral += "M";
					mill--;
				}
				while (cent > 0) 
				{
					if (cent == 9)
					{
						romanNumeral += "CM";
						cent -= 9;
					}
					else if (cent >= 5)
					{
						romanNumeral += "D";
						int i = cent - 5;
						cent -= 5;
						while (i > 0) 
						{
							romanNumeral+="C";
							cent--;
							i--;
						}
					}
					else if (cent == 4) 
					{
						romanNumeral += "CD";
						cent -= 4;
					}
					else 
					{
						while (cent > 0) 
						{
							romanNumeral += "C";
							cent--;
						}
					}
				}
				while (dec > 0)
				{
					if (dec == 9)
					{
						romanNumeral += "XC";
						dec -= 9;
					}
					else if (dec >= 5)
					{
						romanNumeral += "L";
						int i = dec - 5;
						dec -= 5;
						while (i > 0) 
						{
							romanNumeral += "X";
							dec--;
							i--;
						}
					}
					else if (dec == 4) 
					{
						romanNumeral += "XL";
						dec -= 4;
					}
					else {
						while (dec > 0)
						{
							romanNumeral+="X";
							dec--;
						}
					}
				}
					while (year > 0) 
					{
						if (year == 9)
						{
							romanNumeral += "IX";
							year -= 9;
						}
						else if (year >= 5)
						{
							romanNumeral += "V";
							int i = year - 5;
							year -= 5;
							while (i > 0) 
							{
								romanNumeral += "I";
								year--;
								i--;
							}
						}
						else if (year == 4) 
						{
							romanNumeral += "IV";
							year -= 4;
						}
						else 
						{
							while (year > 0) 
							{
								romanNumeral += "I";
								year--;
							}
						}
						
					}
			 JOptionPane.showMessageDialog(null, "Roman Numeral: "+romanNumeral);
			}
			else 
			{
				 JOptionPane.showMessageDialog(null, "Input is Invalid");
				 
			}
	}
}
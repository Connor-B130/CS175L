import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.LocalDate;

public class ageCalc
{

	public static void main(String[] args)
	{
				  
		  String input = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYY): ");
	      String [] birthdaySplit = input.split("/");
	      String birthYear = birthdaySplit [2];
	      String birthDay = birthdaySplit [1];
	      String birthMonth = birthdaySplit [0];
	      
	      LocalDate systemDate = LocalDate.now();
		  String dateToday = systemDate.toString();
		  String [] currentDateSplit = dateToday.split("-");
		  String currentYear = currentDateSplit [0];
	      String currentDay = currentDateSplit [2];
	      String currentMonth = currentDateSplit [1];
	      JOptionPane.showMessageDialog(null,"Enter today's date (MM/DD/YYYY): " + LocalDate.now());
	      
	      int currentYearInt = Integer.parseInt(currentYear);
	      int currentMonthInt = Integer.parseInt(currentMonth);
	      int currentDayInt = Integer.parseInt(currentDay);
	      int birthYearInt = Integer.parseInt(birthYear);
	      int birthMonthInt =Integer.parseInt(birthMonth);
	      int birthDayInt=Integer.parseInt(birthDay);
	      
	  
	      int yearDifference = currentYearInt - birthYearInt;
	      int monthDifference = currentMonthInt - birthMonthInt;
	      int dayDifference = currentDayInt - birthDayInt;
	      
	     
	      int daysPrevMonth = 0;
	      
	      if (currentMonthInt % 2 == 1 && currentMonthInt!=3)
	      {
	    	  daysPrevMonth = 30;
	      }
	      else if (currentMonthInt % 2 == 0)
	      {
	    	  daysPrevMonth = 31;
	      }
	      else 
	      {
	    	  daysPrevMonth = 28;
	      }
	      
	      if (monthDifference < 0)
	      {
	    	  yearDifference--;
	    	  monthDifference = 12 - birthMonthInt + currentMonthInt;
	      }
	      else if (monthDifference == 0 && dayDifference < 0)
	      {
	    	  yearDifference--;
	    	  monthDifference = 11;
	      }
	    	      
	      
	      if (dayDifference > 0)
	      {
	    	  dayDifference = currentDayInt - birthDayInt;
	      }
	      else if(dayDifference < 0) 
	      {
	    	 monthDifference--;
	    	 dayDifference = daysPrevMonth - (birthDayInt - currentDayInt);
	      }
	      else 
	      {
	    	  dayDifference = 0;
	    	  if (monthDifference == 12)
	    	  {
	    		  yearDifference++;
	    		  monthDifference = 0;
	    	  }	  
	      }

	      JOptionPane.showMessageDialog(null,"You are " + yearDifference + " years " + monthDifference + " month(s) " + dayDifference + " day(s) old.");
	 
	}

}
import java.util.Random;

public class randArrayAndSearch 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int array[] = new int [50];
		int num;
		boolean valueSet = false;
		int largest = 0;
		int smallest = 0;
		
		for (int i = 0;i < array.length;i++)
		{
			num = rand.nextInt(25)+1;
			if (!valueSet)
			{
				largest = num;
				smallest = num;
				valueSet = true;
			}
			array[i] = num;
			if (num > largest) 
			{
				largest = num;
			}
			if (num < smallest)
			{
				smallest = num;
			}
			
		}
		for (int x = 0; x < array.length;x++) 
		{
			System.out.print(array[x]+" ");			
		}
		
		int count = 1;
		int tempCount;
		int popNumber = array[0];
		int temp = 0;
		
		for (int x = 0;x < (array.length-1);x++)
		{
			temp = array[x];
			tempCount = 0;
		    for (int y = 1;y < array.length;y++)
		    {
		      if (temp == array[y])
		    	  tempCount++;
		    }
		    if (tempCount>count)
		    {
		      popNumber = temp;
		      count = tempCount;
		    }
		}
		
		System.out.println("\nLargest: " + largest);
		System.out.println("Smallest: " + smallest);
		System.out.println("Product of largest and smallest: " + (largest * smallest));
		System.out.println("Most frequent number: " + popNumber);
		System.out.println("Times present in array: " + count);
	}

}
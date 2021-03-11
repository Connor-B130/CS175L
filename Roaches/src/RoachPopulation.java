public class RoachPopulation 
{

	private double roachPop;

	public RoachPopulation (double startPop)
	{
			roachPop = startPop;
		
	}
	
	public void breed()
	{
		roachPop = roachPop*2;
	}
	public void spray(double sprayNum)
	{
		roachPop = roachPop - (roachPop*sprayNum);
	}
	public double getRoachPopulation() 
	{
		return roachPop;
	}
}
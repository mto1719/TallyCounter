/**
 * 
 * @author mto19
 *
 */
public class TallyCounter 
{
	//Instance variables
	
	private int count;
	
	
	//Constructors
	
	
	public TallyCounter()
	{
		count = 0;
	}
	public TallyCounter(int a)
	{
		count = a;
	}
	
	
	//Methods
	
	public void click()
	{
		count = count + 1;//count++ = count + 1
		//another option is count += 1
	}

	public int getCount()
	{
		return count;
	}
	public void reset()
	{
		count = 0;
	}
	public void unClick()
	{
		count--;
	}
}

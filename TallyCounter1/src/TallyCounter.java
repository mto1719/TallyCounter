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
		count = a + count + 1;//count++ = count + 1
		//another option is count += 1
	}

	public void getCount();
	public void reset();
	public void unClick();
}

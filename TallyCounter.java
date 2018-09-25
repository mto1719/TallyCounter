
public class TallyCounter 
{
	//Instance variables
	
	private int count;
	
	
	//Constructors
	
	
	public TallyCounter()
	{
		count = 0;
	}
	
	//Methods
	
	public void click()
	{
		count = count + 1;//count++ = count + 1
		//another option is count += 1
	}

}

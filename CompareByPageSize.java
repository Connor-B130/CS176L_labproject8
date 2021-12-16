package labproject8.interfaces;

import java.util.Comparator;

public class CompareByPageSize implements Comparator<WrittenWorks> 
{

	public int compare(WrittenWorks one, WrittenWorks two) 
	{
		if(one.getPageSize() > two.getPageSize()) 
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
}
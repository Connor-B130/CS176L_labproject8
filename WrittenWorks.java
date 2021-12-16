package labproject8.interfaces;

//WrittenWork.java: Superclass

public class WrittenWorks 
{

	private String title;
	private String author;
	private int year;
	private int pageSize;

	// constructors:
	public WrittenWorks(String title, String author, int year, int pageSize) 
	{
		setPageSize(pageSize);
		setTitle(title);
		setAuthor(author);
		setYear(year);
	}
	public WrittenWorks()
	{
	 
	}

	public boolean equals(WrittenWorks w1) 
	{
    	if(w1 instanceof WrittenWorks) 
    	{
    		if(w1.getTitle() == title && w1.getAuthor() == author && w1.getyear() == year) 
    		{
    			return true;
    		}
    		else 
    		{
    			return false;
    		}
    	}  	
		return false;	
    }
	public void setPageSize(int pageSize) 
	{
		this.pageSize = pageSize;
	}
	public int getPageSize() 
	{
		return pageSize;
	}
	public String getTitle() 
	{
		return title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public int getyear() 
	{
		return year;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public String toString()
	{
		return "title: " + title + "\nauthor: " + author + "\nyear:" + year;
	}
}

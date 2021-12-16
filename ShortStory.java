package labproject8.interfaces;

public class ShortStory extends WrittenWorks
{
	private String genre;
	private int paragraph;
	private boolean hasPics;
	
	public ShortStory(String title, String author, int year, String genre, int paragraphs, boolean hasPics, int pageSize)
	{     
		super.setAuthor(author);
		super.setTitle(title);
		super.setYear(year);
		super.setPageSize(pageSize);
	    setGenre( genre );
	    setParagraphs( paragraphs );
	    setHasPics(hasPics);
	}
	
	public boolean equals(ShortStory story) 
	{
		if(story instanceof ShortStory) 
		{
			if(story.getTitle() == super.getTitle() && story.getAuthor() == super.getAuthor() && story.getyear() == super.getyear() && story.getParagraphs()== paragraph && story.ifHasPics() == hasPics) 
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
	public String getGenre() 
	{
		return genre;
	}
	
	public void setGenre(String genres) 
	{
		genre = genres;
	}
	
	public int getParagraphs() 
	{
		return paragraph;
	}
	
	public void setParagraphs(int paragraphs) 
	{
		paragraph = paragraphs;
	}
	
	public boolean ifHasPics() 
	{
		return hasPics;
	}
	
	public void setHasPics(boolean hasPic) 
	{
		hasPics = hasPic;
	}
	
	public String toString()
	{
		return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nGenre: "+ getGenre() + "\nParagraphs: "+ getParagraphs() + "\nPictures: "+ ifHasPics();
	}
}

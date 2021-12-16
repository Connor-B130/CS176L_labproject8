package labproject8.interfaces;

//Novel.java: Subclass of WrittenWork

public class Novel extends WrittenWorks 
{
	private String genre;
	private int chapters;

// constructors:
	public Novel(String title, String author, int year, String genre, int chapters, int pageSize) 
	{
		/* _________Line 11_________ */
		super.setAuthor(author);
	 	super.setTitle(title);
	 	super.setYear(year);
	 	super.setPageSize(pageSize);
		setGenre( genre );
		setChapters( chapters );
	}

	// accessor methods:
	/**
   		Write the getGenre method.
   		@return genre of Novel
	 */
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}

	public void setChapters(int chapters) 
	{
		this.chapters = chapters;
	}
	public String getGenre()
	{
		return genre;
	}
	/**
   	Write the getChapters method.
   	@return number of Novel chapters
	 */
	public int getChapters()
	{
		return chapters;
	}

	public String toString()
	{
		return ("Title: " + super.getTitle() + "\nAuthor: " + super.getAuthor() + "\nYear: " + super.getYear() + "\nGenre: "+ getGenre() + "\nChapter: "+ getChapters());
	}
}
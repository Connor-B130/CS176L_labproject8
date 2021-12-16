package labproject8.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestWrittenWork
{
	public static void main (String[] args) 
	{

		Novel book1 = new Novel("Moby Dick", "Herman Melville", 1851, "Epic", 135, 632);
		Novel book2 = new Novel("Lord of the Flies", "William Golding", 1954, "Allegory", 12, 224);
		Novel book3 = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Southern Gothic", 21, 281);
		ShortStory story1 = new ShortStory("Hills Like White Elephants", "Ernest Hemingway", 1927, "Ficton", 25, false, 25);
		ShortStory story2 = new ShortStory("Rip Van Winkel", "Washiington Irving", 1819 , "Fiction", 121, false, 64);

		ArrayList<WrittenWorks> arr = new ArrayList<WrittenWorks>();
		
		arr.add(book1);
		arr.add(book2);
		arr.add(book3);
		arr.add(story1);
		arr.add(story2);
		
		for (WrittenWorks writtenWork : arr) 
		{
			System.out.println(writtenWork);
			System.out.println();
		}
		
		System.out.println("=================================");
		Collections.sort(arr,new CompareByPageSize());
		
		for (WrittenWorks writtenWork : arr) 
		{
			System.out.println(writtenWork);
			System.out.println();
		}
	}
}


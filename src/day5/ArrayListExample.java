package day5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample 
{
	
	public static void main(String[] args) 
	{
		List<String> mylist=new ArrayList<String>();
		mylist.add("Selenium");
		mylist.add("QTP");
		mylist.add("LR");
		System.out.println(mylist.size());
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		

	}

}

package day17;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		Set<String> myset=new HashSet<>();
		myset.add("Selenium");
		myset.add("QTP");
		myset.add("LR");
		myset.add("Jmeter");
		
		System.out.println(myset.size());
		Iterator<String> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}


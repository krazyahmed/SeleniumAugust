package day5;

public class WhileLoopsExample {

	
	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			int j=1;
			while(j<=10)
			{
				System.out.println(i+"*"+j+"="+i*j);
				j=j+1;
			}
			i=i+1;
		}

	}

}




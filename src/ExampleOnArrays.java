
public class ExampleOnArrays {

	
	public static void main(String[] args) {
		int[] a={10,34,10,25,75,34,67};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
				
			}
			if(count==0)
				System.out.println(a[i]);
		}
		

	}
	
	
	
	
	
	
	
	
	

}

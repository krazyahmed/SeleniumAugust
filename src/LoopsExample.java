
public class LoopsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=4;
		int spaces=2*n-3;
		for(int i=1;i<=n;i++)
		{
			int j;
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			j--;
			for(int k=1;k<=spaces;k++)
			{
				System.out.print(" ");
			}
			spaces=spaces-2;
			if(j==n)
				j--;
			for(int l=j;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}

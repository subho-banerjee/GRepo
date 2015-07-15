
public class Fibonacci {

	
		public static void main(String args[])
		{		
			int i = 0; 
			int j = 1;
			int sum = 0;
			
			for(int k=1;k<=10;k++)
			{
				System.out.println(i);
				sum=i+j;
				i=j;
				j=sum;
			}
		}


}

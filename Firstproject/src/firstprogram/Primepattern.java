package firstprogram;
import java.util.Scanner;

public class Primepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		boolean flag;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			int count=1;
			if(n<8)
				m=2*i;
			else
				m=3*i;
				
			for(int j=1;j<=m;j++)
			{ flag=true;
			for(int k=2;k<j;k++)
			{
			if(j%k==0)
			{ flag=false;
			break;
			}
			
			}
			if (flag==true && count<=i)
			{
				System.out.print(j+" ");
				count++;
			
		     }

			
	    }

			System.out.println();
		}
	}
}

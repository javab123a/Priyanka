package firstprogram;
import java.io.*;

public class Function {
	static int method(int A, int B, int K) 
{
	int count=0;
	InputStreamReader inp=new InputStreamReader(System.in);
	BufferedReader s=new BufferedReader(inp);
	//System.out.println("Enter three numbers:");
	
	/*int A =Integer.parseInt(s.readLine());
	int B =Integer.parseInt(s.readLine());
	int k =Integer.parseInt(s.readLine());*/
	 
	for(int i=A;i<=B;i++)
	
		if(i%K==0) {
			count++;}
			
			return count;
		
		
	
}
	 public static void main(String[] args) {
		
int A=20, B=50, K=5;
System.out.println("NUMBER OF DIGITS DIVISIBLE Between 20 and 50:" +method(A, B,K));
	}

}

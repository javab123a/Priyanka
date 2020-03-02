package firstprogram;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("Enter any number:");
int num=s.nextInt();
int n=num;
int len=0,temp,sum=0,pow=1;
for(;num>0;)
{
	num=num/10;
	len++;
}num=n;
System.out.println("lenght of given number is:"+len);
for(;num>0;)
{temp=num%10;
for(int j=1;j<=len;j++)
{
	pow=pow*temp;
}
sum=sum+pow;
pow=1;
num=num/10;
}
System.out.println("Sum of digits of number"+sum);
if(sum==n)
{System.out.println("Number is Armstrong");
}
else
{
	System.out.println("Number is not Armstrong");
	
}
}
	}



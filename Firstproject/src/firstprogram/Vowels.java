package firstprogram;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int count=0;
		
		System.out.println("Enter any String:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println("Number of vowels are:"+count);
		


	}


}

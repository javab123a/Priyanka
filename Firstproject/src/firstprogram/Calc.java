package firstprogram;

import java.io.*;


public class Calc {

	public static void main(String[] args)throws IOException {
		char ch;
		do{
			InputStreamReader inp=new InputStreamReader(System.in);
			BufferedReader buff=new BufferedReader(inp);
		System.out.println("Enter two number: ");
		int n1=Integer.parseInt(buff.readLine());
		int n2=Integer.parseInt(buff.readLine());
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			//Scanner scan=new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int choice=Integer.parseInt(buff.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Result= "+(n1+n2));
			break;
			case 2:
				System.out.println("Result= "+(n1-n2));
				break;
			case 3:
				System.out.println("Result= "+(n1*n2));
				break;
			case 4:
				System.out.println("Result= "+(n1/n2));
				break;
			default:
					System.out.println("Invalid");
			}
		
		
			System.out.println("Do you want to continue(Y/N) ");
			ch=buff.readLine().charAt(0);
			
			}while(ch=='Y' || ch=='y');
		
	}

}

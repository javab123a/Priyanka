package firstprogram;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number:");
		int number=s.nextInt();
		if(number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz"); 
		}
		else if(number%5==0)
		{
			System.out.println("Buzz");
		}
		else if(number%3==0)
		{ System.out.println("Fizz");
		}
		else
			System.out.println("Wrong Input");
		
		

	}

}

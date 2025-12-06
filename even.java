package java_Even;

import java.util.Scanner;

public class even 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER: ");
		int n = sc.nextInt();
		if(n % 2 != 0)
		{
			System.out.println("It is ODD!");
		}
		else
		{
			System.out.println("It is EVEN!");
		}
	}
}

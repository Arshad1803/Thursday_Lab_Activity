// Java program to display the pattern like right angle triangle with a number. 

import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		System.out.print("Input  number of terms :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <=n; i++)
		{
			for(int j = 1; j <=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}		

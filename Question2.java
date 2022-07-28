// Write a  Java program  to display the cube of the number upto given  integer. 

import java.util.*;
class Question2
{
	public static void main(String args[])
	{
		System.out.print("Input number of terms : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1; i<=n; i++)
		{	
			int cube = i*i*i;		
			System.out.println("Number is: " +i+" and Cube of "+i+" is: " +cube);
		}
	}
}
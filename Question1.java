// Write a Java program that takes a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.*;
class Question1
{
	public static void main(String args[])
	{
		System.out.print("Input number : ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day)
		{
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			case 7:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Invalid Day");
		}
	}
}
			
			
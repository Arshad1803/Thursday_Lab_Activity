// Java Program to cyclically rotate an array clockwise by one.

public class CyclicArray
{
	public static void main(String args[])
	{
		int [] array = { 10, 20 ,30 ,40, 50, 60 };
		System.out.print("Sample input: ");
		for(int i = 0; i< array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();

		System.out.print("Expected output: ");
		for(int i = array.length - 1; i>= 0; i--)
		{
			System.out.print(array[i]+ " ");
		}
	}
}
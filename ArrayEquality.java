// Java Program to test equality of two arrays

import java.util.*;
public class ArrayEquality
{
	public static void main(String args[])
	{
		int[] array1 = {1,2, 3, 4, 5};
		int[] array2 = {1,2, 3, 4, 5};
		System.out.println(Arrays.equals(array1, array2));  // equals() method is used to check if two arrays are equal.
	}
}
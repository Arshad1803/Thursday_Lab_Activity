import java.util.*;
class Question3
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

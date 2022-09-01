//  Program to swap two values using Object reference

public class Swap 
{
  static String a, b;
		    Swap()
		    {
		        a = "This is A";
		        b = "This is B";
		    }
		    void swap(String x,String y)
		    {
		        String sw;
		        sw = x;
		        x = y;
		        y = sw;
		        System.out.println("After Swapping A becomes: "+x);
		        System.out.println("After Swapping B becomes: "+y);
		    }
		    public static void main(String[] args)
		    {
		        Swap obj = new Swap();
		        System.out.println("Before Swapping: ");
		        System.out.println("A: "+a);
		        System.out.println("B: "+b);
		        System.out.println();
		        System.out.println("After Swapping: ");
		        obj.swap(a,b);
		    }
}

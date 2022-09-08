// Program to create a user defined exception

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class Product {
	public void productCheck(int weight) throws MyException {
		if(weight < 100) {
			throw new MyException("Product Invalid");
		}
	}
	public static void main(String[] args) {
		Product p = new Product();
		try {
		p.productCheck(90);	
		}
		catch(MyException e) {
			System.out.println("Exception Caught");
			System.out.println(e);
			}
	}

}

import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Generate Password: ");
		String password = sc.next();
		String regex = "^(?=.*[@*#])(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9@*#]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		boolean match = m.find();
		
		if(match) {
			System.out.println("Security Code Generated Successfully");
		}
		else {
			System.out.println("Invalid Security Code");
		}

	}

}

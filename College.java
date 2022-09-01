// Program to create a Faculty class and subclasses of it.

import java.util.*;

class Faculty{
	public String name;
	private int basic;
	public double salary;
	public Faculty(String name, int basic) {
		this.name = name;
		this.basic = basic;
	}
	
	public double getSalary() {
		salary = basic;
		return salary;
	}
	
	public String getDetails() {
		return name + " " + getSalary();
	}
}

class AssistantProfessor extends Faculty{
	public int DA;
	public AssistantProfessor(String name, int basic, int DA) {
		super(name, basic);
		this.DA = DA;
	}
	
	public double getSalary() {
		return super.getSalary() + ((super.getSalary() * DA) / 100);
	}
	
	public String getDetails() {
		return "AssisProf " + name + " " + getSalary();
	}
}

class AssociateProfessor extends AssistantProfessor{
	public int MedAllowance;
	public AssociateProfessor(String name, int basic, int DA, int MedAllowance) {
		super(name, basic, DA);
		this.MedAllowance = MedAllowance;
	}
	
	public double getSalary() {
		return super.getSalary() + MedAllowance;
	}
	
	public String getDetails() {
		return "AssoProf " + name + " " + getSalary();
	}
}

class Professor extends AssociateProfessor{
	public int otherAllowance;
	public Professor(String name, int basic, int DA, int MedAllowance, int otherAllowance) {
		super(name, basic, DA, MedAllowance);
		this.otherAllowance = otherAllowance;
	}
	
	public double getSalary() {
		return super.getSalary() + ((otherAllowance * super.getSalary()) / 100);
	}
	
	public String getDetails() {
		return "Prof " + name + " " + getSalary();
	}
}
public class College {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose the type of Professor: ");
		int i = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Basic: ");
		int basic = sc.nextInt();
		System.out.print("Enter DA: ");
		int DA = sc.nextInt();
		System.out.print("Enter MedAllowance: ");
		int medAllowance = sc.nextInt();
		System.out.print("Enter OtherAllowance: ");
		int otherAllowance = sc.nextInt();
		System.out.println();
		
		AssistantProfessor assistant = new AssistantProfessor(name, basic, DA);
		AssociateProfessor associate = new AssociateProfessor(name, basic, DA, medAllowance);
		Professor professor = new Professor(name, basic, DA, medAllowance, otherAllowance);
		
		if(i == 1) {
			System.out.println(assistant.getDetails());
		}
		else if(i == 2) {
			System.out.println(associate.getDetails());
		}
		else if(i == 3) {
			System.out.println(professor.getDetails());

		}		
	}
}

// Program to create a superclass Student and two subclass UnderGrad and Grad and override isPassed() method.

abstract class Student{
	private String name;
	protected int id;
	double grade;
	public int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	
	abstract  Boolean isPassed(double grade);
}
 class UnderGrad extends Student{
	public Boolean isPassed(double grade) {
		if(grade > 70.0) {
			return true;
		}
		else {
			return false;
	}
}
 }
 class Grad extends Student{
	 public Boolean isPassed(double grade) {
		 if(grade > 80.0) {
			 return true;
			}
			else {
				return false;
			}
	 }
 }
public class Passed {

	public static void main(String[] args) {
		UnderGrad ug = new UnderGrad();
		Grad g = new Grad();
		ug.setName("Arshad Godhrwala");
		ug.setId(18);
		ug.grade = 55.0;
		if(ug.isPassed(ug.grade)){
			System.out.println("An UnderGrad Student: "+ug.getName() +" with id: "+ ug.getId() +" got grade "+ ug.grade+" and passed the test.");
		}
		else {
			System.out.println("An UnderGrad Student: "+ug.getName() +" with id: "+ ug.getId() +" got grade "+ ug.grade+" and failed the test.");
		}
		
		g.setName("Arshad Godhrwala");
		g.setId(18);
		g.grade = 90.0;
		if(g.isPassed(g.grade)){
			System.out.println("A Grad Student: "+g.getName() +" with id: "+ g.getId()+" got grade "+ g.grade+" and passed the test.");
		}
		else {
			System.out.println("A UnderGrad Student: "+g.getName() +" with id: "+ g.getId()+" got grade "+ g.grade+" and failed the test.");
		}
			
		
		

	}
}



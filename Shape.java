// Program to create an abstract class Shape with two variables color and filled and also create two subclass of Shape i.e. Circle and Rectangle and make rectangle a final class and create a subclass of Rectangle and try to inherit the properties of it.

abstract public class Shape {
	String color;
	boolean filled;
	Shape(){
		color = "green";
		filled = true;
	}
	Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "A Shape with color of " + color + " and " + (filled ? "" : "Not ") + "filled.";
	}
	
	class Circle extends Shape{
		int getArea() {
			return 0;
		}
	}
	
	class Rectangle extends Shape{
		int width;
		int length;
		Rectangle(int width, int length){
			this.width = width;
			this.length = length;
		}
		
		int getArea() {
			return 0;
		}
	}
	
	class Square extends Rectangle{
		public Square(){
		super(15, 15);
		System.out.println("Width: " +super.width);
		System.out.println("Length: " +super.length);
	}
}
	public static void main(String[] args) {
//		System.out.println(shape1);
//		Shape shape2 = new Shape("blue", false);
//		System.out.println(shape2);
//		Shape shape3 = new Shape();
//		shape3.setColor("red");
//		shape3.setFilled(true);
//		System.out.println(shape3);
		

	}

}

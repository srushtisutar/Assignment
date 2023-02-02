package LabAss_4;
//Hierarchical inheritance
class Circle extends Shape  //Circle is child class 
{
	public void getArea() // method
	{
		int r=7;
		double  pi = 3.14;
		double area =pi*r*r;    // calculate area of circle
		System.out.println(area);
		
	}
}
class Triangle extends Shape//Triangle is child class 
{
	public void getArea() // method
	{
		int b=6;
		int h=8;
		double area=(b*h)/2;   // calculate area of triangle
		System.out.println(area);
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();  // create object
		System.out.println("Area of Circle :");
		c.getArea(); // method call
		System.out.println("Area of Triangle");
		Triangle t = new Triangle();  // create object
		t.getArea();   // method call

	}

}
	

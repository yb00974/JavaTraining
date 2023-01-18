package ccom.citibank.main;

import java.util.Scanner;

import ccom.citibank.main.domain.Circle;
import ccom.citibank.main.domain.Line;
import ccom.citibank.main.domain.Shapes;
import ccom.citibank.main.domain.Triangle;

public class ShapesMain {

	public static void main(String[] args) {
		//this will call parent class first n chid class constructor after
//		//even when we created object of child due to inheritance
//		//Circle circle = new Circle();
//		//this statement calls the default constructor of base class even though we invoke
//		//parm constructor as super() is without any value. to avoid this write super(size) in child constructor
//		Circle circle = new Circle(10);
//		//but for method when we use object of child n clal method child method will call
//		circle.draw();	
		
		//polymorphism
		//reference of base class is assigned the object of child class. so objects created here are 2
		//child + base and here it base class object is showing polymorphism nature
//		Shapes shapes = new Circle();
//		shapes.draw();
//		//thru refrence(shapes) but object of circle it is we are able to call print method of shapes (base ) class
//		shapes.print();
//		shapes.changeShapes();
		//polymorphism when i dnt know what input user will give
		//to accept i/p scanner use
		//non static method cannot be called in static method which is main here. so either we defineShapesMAin class object
		//or other method is we defined getShape as Static method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Choice:");
		System.out.println("1.Circle 2.Triangle 3.Line");
		int choice = scanner.nextInt();
		
		Shapes shapes = getShape(choice);
		shapes.draw();		
	}
	
	public static Shapes getShape(int choice) {
		if (choice == 1) {
			Shapes shapes = new Circle();
			return shapes;			
		}
		if (choice == 2) {
			return new Triangle();
		}
		if (choice == 3) {
			return new Line();
		}
		//return new Shapes();-->because we made shapes as abstarct class so now we return null
		return null;
	}

}

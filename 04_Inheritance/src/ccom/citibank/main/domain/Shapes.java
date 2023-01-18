package ccom.citibank.main.domain;

//public class Shapes  {
public abstract class Shapes {
//we created abstract claa(base class) so now cannot create object bt inheritance according
//child object will create base class object 
//generalization as its super class
	// public class Shapes extends Object
//i coded extends Object which is main parent class for all classes	
	public Shapes() {
		// this is base class constructor
		super();
		System.out.println("Default Constructor of Shapes");
	}

	public Shapes(int size) {
		System.out.println("Param Constructor of Shapes :");
		System.out.println("Size ::" + size);
	}
	//abstract method-->can only be used under abstract class
	//abstract method will not have body
	//by giving abstract method here i enforce my child to create draw method mandatorily. if i dont i will get error
	
	public abstract void draw();

//	public void draw() {
//		System.out.println("Drawing Shapes");
//	}
	public void print() {
		System.out.println("test print for shapes");
			}
	public void changeShapes() {
		System.out.println("chnaging shapes");
	}

}

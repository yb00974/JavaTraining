package ccom.citibank.main.domain;

public class Circle extends Shapes {

	// child class constructor
	public Circle() {
		// compiler here explicitly puts super(); here before object defination
		// which we deleted.super means as it is
		// that is why it is automatically call parent class constructor
		// so super should be first statement before sysout
		//if we would have kept sysout before it will fail
		System.out.println("Default Constructor for Circle");
	}
	public Circle(int size) {
		super(size);
		System.out.println("Param Constructor of Circle :");
		System.out.println("Size ::" + size);
	}

	// we will write draw method which we will override
	// ctrl+space draw() override option will come from shapes
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		// super.draw();-->this go an call parent shapes draw but we need our own
		System.out.println("Circle class draw");
	}

}

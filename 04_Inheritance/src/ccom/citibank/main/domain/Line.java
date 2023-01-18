package ccom.citibank.main.domain;

public class Line extends Shapes {
	//child constructor
	public Line() {
		System.out.println("Default Constructor for Line");
	}
	public Line(int size) {
		System.out.println("Param Constructor of Line :");
		System.out.println("Size ::" + size);
	}
	@Override
	public void draw() {
		System.out.println("Line class draw");
		//super.draw();
	}

}

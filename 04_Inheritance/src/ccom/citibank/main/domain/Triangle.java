package ccom.citibank.main.domain;

public class Triangle extends Shapes {
	//child constructor as its child class
	public Triangle() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor for Triangle");
	}
	public Triangle(int size) {
		System.out.println("Param Constructor of Triangle :");
		System.out.println("Size ::" + size);
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		//super.draw();
		System.out.println("Tiangle class draw");
	}

}

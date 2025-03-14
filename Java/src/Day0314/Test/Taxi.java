package Day0314.Test;

public class Taxi extends Car {

	public String name ;
	public String name2;
	
	public Taxi(){
		this.name = "Taxi Car";
		this.name2 = "Taxi" ;
	}
	
	public void printString() {
		System.out.println("Taxi	: " + this.name);
		System.out.println("Taxi	: " + this.name2);
	}
}

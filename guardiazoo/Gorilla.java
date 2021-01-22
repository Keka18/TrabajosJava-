package cl.coding.java.guardiazoo;

public class Gorilla extends Mammal{

	public Gorilla(Integer energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
	}
	public  void throwSomething() {
		this.energyLevel = this.energyLevel -5;
		System.out.println("El gorila ha lanzado algo");
	}
	public void eatBananas() {
		this.energyLevel =this.energyLevel + 10;
		System.out.println("satisfacción del gorila");
	}
	public void climb() {
		this.energyLevel= this.energyLevel -10;
		System.out.println("El gorila ha trepado a la cima de un árbol");
	}
}

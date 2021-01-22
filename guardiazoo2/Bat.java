package cl.coding.java.guardiazoo2;

import cl.coding.java.guardiazoo.Mammal;

public class Bat extends Mammal{

	public Bat(Integer energyLevel) {
		super(energyLevel);
		// TODO Auto-generated constructor stub
		super.energyLevel=300;
		

	}

	public void fly () {
		this.energyLevel = this.energyLevel -50;
		System.out.println("el sonido que hace el Bat al despegar ");
		System.out.println(energyLevel);
	}
	
	public void eatHumans () {
		this.energyLevel = this.energyLevel +25;
		System.out.println("bueno, no importa");
		System.out.println(energyLevel);
	}
	
	public void attackTown () {
		this.energyLevel = this.energyLevel -100;
		System.out.println("el sonido de la ciudad en llamas");
		System.out.println(energyLevel);
	}
	
}

package com.codingdojo.bat;

public class Bat {
	private int energy = 300;
	
	public void fly() {
		System.out.println("Bat flight sounds.");
		energy -= 50;
	}
	
	public void eatHumans() {
		energy += 25;
	}
	
	public void attackTown() {
		System.out.println("Town on fire sounds.");
		energy -= 100;
	}
	
	public void showEnergy() {
		System.out.println(energy);
	}

}

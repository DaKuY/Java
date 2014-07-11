package com.andrewcamero.abstracts;

/*
 * Wolf extneds the abstract class Animal
 */
public class Wolf extends Animal{

	@Override
	public void makeSound() {
		System.out.println("Howl!");		
	}

	@Override
	public void getName() {
		System.out.println("I'm a Wolf!");
	}

}

package com.andrewcamero.interfaces;

import java.util.List;
import com.andrewcamero.abstracts.Animal;

/*
 * @author Andrew
 * Uses interface to create a list of Animals and iterates through them. 
 */
public class AppJava {

	public static void main(String[] args) {
		
		int test = Integer.parseInt("/");
		System.out.println(test);
		
		AnimalService animalService = new AnimalServiceImpl();
		
		List<Animal> animalList = animalService.getAllAnimals();
		
		for (Animal animal:animalList){
			animal.getName();
			animal.makeSound();
			System.out.println();
		}

	}

}

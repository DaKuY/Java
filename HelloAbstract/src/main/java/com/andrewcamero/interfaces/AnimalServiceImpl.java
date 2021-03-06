package com.andrewcamero.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.andrewcamero.abstracts.Animal;
import com.andrewcamero.abstracts.Tiger;
import com.andrewcamero.abstracts.Wolf;

/*
 * Implements interface and adds animals to the list
 *
 */
public class AnimalServiceImpl implements AnimalService{

	@Override
	public List<Animal> getAllAnimals() {
		List<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Wolf());
		animalList.add(new Wolf());
		animalList.add(new Tiger());
		
		return animalList;
	}
	
	

}

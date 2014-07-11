package com.andrewcamero.interfaces;

import java.util.List;

/*
 * Inferface that returns a List of Animals
 */
import com.andrewcamero.abstracts.Animal;

public interface AnimalService {
	
	public List<Animal> getAllAnimals();

}

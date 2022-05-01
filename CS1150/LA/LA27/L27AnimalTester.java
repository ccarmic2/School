// Topic: Inheritance and Polymorphism
// Explore code

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L27AnimalTester {

	public static void main(String[] args) throws IOException {

		final String FILE_NAME = "L27Animals.txt";
		final int NUM_ANIMALS = 5;

		File inputFileName = new File(FILE_NAME);
		Scanner inputFile = new Scanner(inputFileName);

		// Create an array to hold Animal objects
		Animal[] animals = new Animal[NUM_ANIMALS];

		for (int i = 0; i < animals.length; i++) {

			// Read information for the current animal
			String type = inputFile.next();
			String name = inputFile.next();

			// Determine which animal was read and create an object for that animal
			switch (type) {
			  case "Hippo":
				animals[i] = new Hippo(name);
				break;
			  case "Lion":
				animals[i] = new Lion(name);
				break;
			  case "Tiger":
				animals[i] = new Tiger(name);
				break;
				case "Wolf":
				animals[i] = new Wolf(name);
				break;
				case "Hyena":
				animals[i] = new Hyena(name);
			}
		} // for

		//create a Vet Object to work with the animals
		Vet petDoc = new Vet();

		// Now let's demonstrate the power of polymorphism!
		System.out.println("Use the debugger to see polymorphism in action");
		for (int i = 0; i < animals.length; i++) {
			System.out.println();
			System.out.printf("Make animal %d eat, sleep and swim\n", i);
			String testGetName = animals[i].getName();
			System.out.println("Name: " + testGetName);
			String testToString = animals[i].toString();
			System.out.println("toString: " + testToString);
			animals[i].eat();
			animals[i].sleep();
			animals[i].swim();
			System.out.println("Pet getting shot from the Vet");
			petDoc.giveShot(animals[i]);
		}
	} // main
}


class Animal {

	// Instance variables for an Animal
	private String name;

	// Constructor that initializes the instance variables
	public Animal(String name) {
		this.name = name;
	}

	// Return animal's name
	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println("Animal is eating");
	}

	public void sleep() {
		System.out.println("Animal is sleeping");
	}

	public void swim() {
		System.out.println("Animal is swimming");
	}

	public void makeNoise() {
		System.out.println("Animal making noise");
	}

} // Animal

class Hippo extends Animal {

	public Hippo(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println("Hippo is swimming - swim method overridden");
	}

	@Override
	public String toString() {
		return "Hippo: Name: " + getName();
	}

	@Override
	public void makeNoise() {
		System.out.println("Hippo Snort Snort");
	}

} // Hippo

class Lion extends Animal {

	public Lion(String name) {
		super(name);
	}
	// Use @Override to indicate it is overriding
	@Override
	public void eat() {
		System.out.println("Lion is eating - eat method overridden");
	}

	@Override
	public void makeNoise() {
		System.out.println("Lion ROARRRRRR");
	}

} // Lion

class Tiger extends Animal {

	public Tiger(String name) {
		super(name);
	}

	@Override
	public void sleep() {
		System.out.println("Tiger is sleeping - sleep method overridden");
	}

} // Tiger

class Wolf extends Animal{

	public Wolf(String name){
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Wolf is eating - eat method overridden");
	}

	@Override
	public void sleep(){
		System.out.println("Wold is sleeping - sleep method overridden");
	}

	@Override
	public void makeNoise(){
		System.out.println("Wolf is Howling - makeNoise method overridden");
	}

	@Override
	public String toString(){
		return "Wolf's name: " + getName();
	}

}//Wolf

class Hyena extends Animal {

	public Hyena(String name){
		super(name);
	}

	@Override
	public void swim(){
		System.out.println("Hyena is swiming - swim method overridden");
	}

	@Override
	public void makeNoise(){
		System.out.println("Hyena is laughing - makeNoise method overridden");
	}

	@Override
	public String toString(){
		return "Hyena's name: " + getName();
	}

}//Hyena

class Vet {

	public void giveShot (Animal anyAnimal) {
		anyAnimal.makeNoise();
	}
}

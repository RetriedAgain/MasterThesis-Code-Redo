package de.masterzoo.groups.animalia;

import de.Gender;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.groups.animalia.reproduction.Oviparity;
import de.masterzoo.groups.animalia.reproduction.ReproductionStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Animal {

	private String name;
	private int age;
	private int speed;
	private int weight;
	private int costPerMonth;

	public int numOfLegs;
	protected Gender GENDER;
	public List<MovementStrategy> movementStrategies;
	public ReproductionStrategy reproductionStrategy;


	public Animal() {

	}

	public Animal(int numOfLegs, Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy, ArrayList<MovementStrategy> movementStrategies) {
		this.numOfLegs = numOfLegs;
		this.GENDER = GENDER;
		this.name = name;
		this.age = age;
		this.speed = speed;
		this.weight = weight;
		this.movementStrategies = movementStrategies;
		this.reproductionStrategy = reproductionStrategy;

		AnimalBookkeeping.getAllAnimals().add(this);
	}

	public Animal createTempAnimal() {
		int numOfLegs = new Random().nextInt(1306);
		int age = new Random().nextInt(150);
		int speed = new Random().nextInt(389);
		int kg = new Random().nextInt(190_000);

		return new Animal(numOfLegs, Gender.MALE, "Tom", age, speed, kg, new Oviparity(), new ArrayList<>() {{
			new Walk();
		}}) {

			@Override
			public boolean isItFat(int weightInKG) {
				System.out.println(
					"No animal is \"fat\", no. Especially not one as cute as this weighing only " + weightInKG + "kg!");
				return true;
			}
		};
	}

	public boolean isItFat(int weightInKG) {
		return weightInKG >= 500;
	}

	public void eat() {
		System.out.println("eat");
	}

	public void makeSound() {
		System.out.println("Woof!");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public Gender getGENDER() {
		return GENDER;
	}

	public void setGENDER(Gender GENDER) {
		this.GENDER = GENDER;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCostPerMonth() {
		return costPerMonth;
	}

	public void setCostPerMonth(int costPerMonth) {
		this.costPerMonth = costPerMonth;
	}
}

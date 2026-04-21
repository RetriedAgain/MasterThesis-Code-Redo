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

	private int numOfLegs;
	private Gender GENDER;
	private List<MovementStrategy> movementStrategies;
	private ReproductionStrategy reproductionStrategy;


	public Animal() {

	}

	public Animal(int numOfLegs, Gender GENDER, String name, int age, int speed, int weight, ReproductionStrategy reproductionStrategy, ArrayList<MovementStrategy> movementStrategies) {
		this.setNumOfLegs(numOfLegs);
		this.setGENDER(GENDER);
		this.setName(name);
		this.setAge(age);
		this.setSpeed(speed);
		this.setWeight(weight);
		this.setMovementStrategies(movementStrategies);
		this.setReproductionStrategy(reproductionStrategy);

		AnimalBookkeeping.getAllAnimals().add(this);
	}

	public static Animal createTempAnimal() {
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

	private void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return this.age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	private void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public Gender getGENDER() {
		return GENDER;
	}

	private void setGENDER(Gender GENDER) {
		this.GENDER = GENDER;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	private void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCostPerMonth() {
		return costPerMonth;
	}

	public void setCostPerMonth(int costPerMonth) {
		this.costPerMonth = costPerMonth;
	}

	public List<MovementStrategy> getMovementStrategies() {
		return movementStrategies;
	}

	public void setMovementStrategies(List<MovementStrategy> movementStrategies) {
		this.movementStrategies = movementStrategies;
	}

	public ReproductionStrategy getReproductionStrategy() {
		return reproductionStrategy;
	}

	public void setReproductionStrategy(ReproductionStrategy reproductionStrategy) {
		this.reproductionStrategy = reproductionStrategy;
	}
}

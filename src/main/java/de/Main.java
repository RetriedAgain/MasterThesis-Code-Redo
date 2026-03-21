package de;

import de.masterzoo.Department;
import de.masterzoo.Zoo;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.birds.Bird;
import de.masterzoo.groups.animalia.canines.Labrador;
import de.masterzoo.groups.animalia.movement.Fly;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.movement.Walk;
import de.masterzoo.humanresources.Employee;
import de.masterzoo.infrastructure.props.Ball;
import de.masterzoo.infrastructure.props.Prop;
import de.masterzoo.partnercompanies.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main class creating the zoo in the first place. Primarily for testing purposes.
 */
public class Main {
	public static void main(String[] args) {
		Animal myTempAnimal = Animal.createTempAnimal();
		Animal myTempAnimal2 = Animal.createTempAnimal();
		List<Animal> animalsInZoo = new ArrayList<>();
		animalsInZoo.add(myTempAnimal);
		animalsInZoo.add(myTempAnimal2);

		List<Prop> propsInZoo = new ArrayList<>();
		Ball ball = new Ball();
		Ball ball2 = new Ball();

		List<Company> partnerCompanies = new ArrayList<>();

		Zoo myZoo = new Zoo(10000, 12000, animalsInZoo, propsInZoo, partnerCompanies);

		Bird myChicken = new Bird() {
			{
				chickenDefaultHatchText();
				getReproductionStrategy().handleReproduction();
			}

			static void chickenDefaultHatchText() {
				System.out.println("Chicken has been created");
				System.out.println("Chicken is by default Male");
				System.out.println("Chicken is by default laying 1 egg per week");
			}

			public static void bockock() {
				System.out.println("bockooock");
			}

			public void cackle() {
				System.out.println("cackle");
			}
		};
		myChicken.layEgg();

		Bird myChicken2 = new Bird() {
			{
				chickenDefaultHatchText();
				getReproductionStrategy().handleReproduction();
			}

			static void chickenDefaultHatchText() {
				System.out.println("Chicken has been created");
				System.out.println("Chicken is by default Male");
				System.out.println("Chicken is by default laying 1 egg per week");
			}

			public static void bockock() {
				System.out.println("bockooock");
			}

			public void cackle() {
				System.out.println("cackle");
			}
		};
		myChicken2.layEgg();

		// A pup that can also fly
		Labrador superPup = new Labrador(
			myTempAnimal.getGENDER(),
			myTempAnimal.getName(),
			myTempAnimal.getAge(),
			myTempAnimal.getSpeed(),
			myTempAnimal2.getWeight(),
			myTempAnimal.getReproductionStrategy()) {

			@Override
			public void setMovementStrategies(List<MovementStrategy> movementStrategies) {
				super.setMovementStrategies(new ArrayList<>() {{
					add(new Walk());
					add(new Fly());
				}});
			}
		};
		System.out.println(superPup.getMovementStrategies());



		Labrador useLowestLinkConstructor1 = new Labrador(
			myTempAnimal.getGENDER(),
			myTempAnimal.getName(),
			myTempAnimal.getAge(),
			myTempAnimal.getSpeed(),
			myTempAnimal.getWeight()
		);

		Labrador useLowestLinkConstructor2 = new Labrador(
			myTempAnimal2.getGENDER(),
			myTempAnimal2.getName(),
			myTempAnimal2.getAge(),
			myTempAnimal2.getSpeed(),
			myTempAnimal2.getWeight()
		);

		Labrador useMiddleLinkConstructor1 = new Labrador(
			myTempAnimal.getGENDER(),
			myTempAnimal.getName(),
			myTempAnimal.getAge(),
			myTempAnimal.getSpeed(),
			myTempAnimal.getWeight(),
			myTempAnimal.getReproductionStrategy()
		);

		Labrador useMiddleLinkConstructor2 = new Labrador(
			myTempAnimal2.getGENDER(),
			myTempAnimal2.getName(),
			myTempAnimal2.getAge(),
			myTempAnimal2.getSpeed(),
			myTempAnimal2.getWeight(),
			myTempAnimal2.getReproductionStrategy()
		);

		Employee companionForUpperConstructor1 = new Employee("Derek", 25, Department.HUMANRESOURCES);
		Employee companionForUpperConstructor2 = new Employee("Derek", 25, Department.HUMANRESOURCES);

		Labrador useUpperLinkConstructor1 = new Labrador(
			myTempAnimal.getGENDER(),
			myTempAnimal.getName(),
			myTempAnimal.getAge(),
			myTempAnimal.getSpeed(),
			myTempAnimal.getWeight(),
			myTempAnimal.getReproductionStrategy(),
			companionForUpperConstructor1
		);

		Labrador useUpperLinkConstructor2 = new Labrador(
			myTempAnimal2.getGENDER(),
			myTempAnimal2.getName(),
			myTempAnimal2.getAge(),
			myTempAnimal2.getSpeed(),
			myTempAnimal2.getWeight(),
			myTempAnimal2.getReproductionStrategy(),
			companionForUpperConstructor2
		);
	}

}

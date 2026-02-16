package de;

import de.masterzoo.Zoo;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.groups.animalia.canines.Labrador;
import de.masterzoo.groups.animalia.movement.Fly;
import de.masterzoo.groups.animalia.movement.MovementStrategy;
import de.masterzoo.groups.animalia.movement.Walk;
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
		Animal myTempAnimal = new Animal().createTempAnimal();
		Animal myTempAnimal2 = new Animal().createTempAnimal();
		List<Animal> animalsInZoo = new ArrayList<>();
		animalsInZoo.add(myTempAnimal);
		animalsInZoo.add(myTempAnimal2);

		List<Prop> propsInZoo = new ArrayList<>();
		Ball ball = new Ball();
		Ball ball2 = new Ball();

		List<Company> partnerCompanies = new ArrayList<>();

		Zoo myZoo = new Zoo(10000, 12000, animalsInZoo, propsInZoo, partnerCompanies);

		// A pup that can also fly
		Labrador superPup = new MyLabrador(myTempAnimal, myTempAnimal2);

		System.out.println(superPup.getMovementStrategies());

	}

	private class MyLabrador extends Labrador {

		public MyLabrador(Animal myTempAnimal, Animal myTempAnimal2) {
			super(myTempAnimal.getGENDER(), myTempAnimal.getName(), myTempAnimal.getAge(), myTempAnimal.getSpeed(), myTempAnimal2.getWeight(), myTempAnimal.getReproductionStrategy());
		}

		@Override
		public void setMovementStrategies(List<MovementStrategy> movementStrategies) {
			super.setMovementStrategies(new ArrayList<>() {{
					add(new Walk());
					add(new Fly());
				}});
		}
	}
}

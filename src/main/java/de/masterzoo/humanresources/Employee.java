package de.masterzoo.humanresources;

import de.masterzoo.groups.animalia.canines.Labrador;
import de.masterzoo.groups.animalia.canines.T;

/**
 * A singular employee who works at the Zoo or one of its partner companies.
 * TODO: Potentially think of extracting subcontractors or other types of employees and think of working contracts.
 */
public class Employee {
	private final String name;
	private int age;

	private T secret;

	public Employee(String name, int age) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public T getCompanionLabrador() {
		return secret;
	}

	public void setCompanionLabrador(Labrador companionLabrador) {
		if (companionLabrador.getHumanCompanion() != null) {
			this.secret = companionLabrador;
		} else {
			System.out.println("Labby already has a human companion!");
		}
	}


}

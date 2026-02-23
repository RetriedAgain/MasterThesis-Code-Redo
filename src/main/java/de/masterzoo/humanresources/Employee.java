package de.masterzoo.humanresources;

import de.masterzoo.groups.animalia.canines.Labrador;

/**
 * A singular employee who works at the Zoo or one of its partner companies.
 * TODO: Potentially think of extracting subcontractors or other types of employees and think of working contracts.
 */
public class Employee {
	private final String name;
	private int age;

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


}

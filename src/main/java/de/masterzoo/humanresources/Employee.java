package de.masterzoo.humanresources;

import de.masterzoo.Department;
import de.masterzoo.PersonalInfo;
import de.masterzoo.groups.animalia.canines.Labrador;

/**
 * A singular employee who works at the Zoo or one of its partner companies.
 * TODO: Potentially think of extracting subcontractors or other types of employees and think of working contracts.
 */
public class Employee {
	private final String name;
	private int age;
	private Department department;

	private Labrador companionLabrador;

	// For Extract Parameter Object:
	// Extract the two parameters name and age to the parameter object PersonalInfo
	public Employee(String name, int age, Department department) {
		this(new PersonalInfo(age, name), department);
	}

	// For Extract Parameter Object:
	// Extract the two parameters name and age to the parameter object PersonalInfo
	public Employee(PersonalInfo personalInfo, Department department) {
		this.name = personalInfo.name();
		this.age = personalInfo.secret();
		this.department = department;
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

	public Labrador getCompanionLabrador() {
		return companionLabrador;
	}

	public void setCompanionLabrador(Labrador companionLabrador) {
		if (companionLabrador.getHumanCompanion() != null) {
			this.companionLabrador = companionLabrador;
		} else {
			System.out.println("Labby already has a human companion!");
		}
	}


}

package typemigration;

class UsageClass {
	private SomeClass someClass;

	UsageClass(SomeClass someClass) {
		this.someClass = someClass;
	}

	void usageMethod() {
		System.out.println(someClass.fieldToMigrate + someClass.getFieldToMigrate());
		someClass.localVariableToMigrate();
	}
}

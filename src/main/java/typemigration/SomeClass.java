package typemigration;

public class SomeClass {
	int fieldToMigrate;

	SomeClass(int fieldToMigrate) {
		this.fieldToMigrate = fieldToMigrate;
	}

	int getFieldToMigrate() {
		return fieldToMigrate;
	}

	void localVariableToMigrate() {
		int localVar = 1;
		System.out.println(localVar + localVar);
	}
}

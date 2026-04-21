package typemigration;

public class SomeClass {
	int fieldToMigrate;

	SomeClass(int fieldToMigrate) {
		this.fieldToMigrate = fieldToMigrate;
	}

	Integer getFieldToMigrate() {
		return fieldToMigrate;
	}

	void localVariableToMigrate() {
		int localVar = 1;
		System.out.println(localVar + localVar);
	}
}

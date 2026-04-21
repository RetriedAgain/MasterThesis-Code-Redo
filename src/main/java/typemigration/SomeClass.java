package typemigration;

public class SomeClass {
	int fieldToMigrate;

	SomeClass(int fieldToMigrate) {
		this.fieldToMigrate = fieldToMigrate;
	}

	int getFieldToMigrate() {
		return fieldToMigrate;
	}

	void localVariableToMigrate(String localVarParam) {
		String localVar = localVarParam;
		localVar += localVar;
		System.out.println(localVar);
	}
}

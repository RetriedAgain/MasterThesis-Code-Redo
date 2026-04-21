package typemigration;

public class SomeClass {
	int fieldToMigrate;

	SomeClass(int fieldToMigrate) {
		this.fieldToMigrate = fieldToMigrate;
	}

	int getFieldToMigrate() {
		return fieldToMigrate;
	}

	void localVariableToMigrate(int localVarParam) {
		int localVar = localVarParam;
		localVar += localVar;
		System.out.println(localVar);
	}
}

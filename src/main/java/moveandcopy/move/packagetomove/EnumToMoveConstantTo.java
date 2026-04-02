package moveandcopy.move.packagetomove;

public enum EnumToMoveConstantTo {
	CONSTANT_TO_MOVE(1);

	int value;
	EnumToMoveConstantTo(int value) {
		this.value = value;
	}

	static void staticMethodToMove() {
		System.out.println("Move this");
		System.out.println("Add the constant in here for good measure + " + CONSTANT_TO_MOVE);
	}
}

package moveandcopy.move.packagetomove;

public enum EnumToMoveConstantTo {
	;

	int value;
	EnumToMoveConstantTo(int value) {
		this.value = value;
	}

	public static void staticMethodToMove() {
		System.out.println("Move this");
		System.out.println("Add the constant in here for good measure + " + ClassToMove.CONSTANT_TO_MOVE);
	}
}

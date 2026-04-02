package moveandcopy.move.packagetomove;

public enum EnumToMoveConstantTo {
	;

	// Movable through menu Move Static Members
	// Can be moved to Enum as Enum Constant, too, because the Enum EnumToMoveConstantTo has a fitting constructor
	final static int CONSTANT_TO_MOVE = 1;
	int value;
	EnumToMoveConstantTo(int value) {
		this.value = value;
	}
}

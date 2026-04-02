package moveandcopy.move.packagetomove;

public class ClassToMove {

	// Semingly unmovable.
	public int fieldToMove;

	// Movable through menu Move Static Members
	public final static int CONSTANT_TO_MOVE = 1;

	public void instanceMethodToMove() {
		System.out.println("Move this");
		System.out.println("fieldToMove = " + fieldToMove);
	}

	public void useInstanceMethodToMove() {
		instanceMethodToMove();
	}

	public static void staticMethodToMove() {
		System.out.println("Move this");
		System.out.println("Add the constant in here for good measure + " + CONSTANT_TO_MOVE);
	}

	public void useStaticMethodToMove() {
		staticMethodToMove();
	}

	class InnerClassToMove {
		private int innerFieldToMove;
		private static int INNER_CONSTANT_TO_MOVE;


	}


}

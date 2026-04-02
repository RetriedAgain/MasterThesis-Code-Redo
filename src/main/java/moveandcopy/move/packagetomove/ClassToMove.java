package moveandcopy.move.packagetomove;

public class ClassToMove {

	// Semingly unmovable.
	public int fieldToMove;

	// Movable through menu Move Static Members
	public final static int CONSTANT_TO_MOVE = 1;

	public void instanceMethodToMove(TypeExclusiveToProject typeExclusiveToProject, TypeExclusiveToProject2 typeExclusiveToProject2) {
		System.out.println("Move this");
		System.out.println("fieldToMove = " + fieldToMove);
		System.out.println("Type1 = " + typeExclusiveToProject);
		System.out.println("Type2 = " + typeExclusiveToProject2);
	}

	public void useInstanceMethodToMove() {
		instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public void useInstanceMethodToMove2() {
		instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
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

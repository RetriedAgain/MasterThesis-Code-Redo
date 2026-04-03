package moveandcopy.move;

import moveandcopy.move.packagetomove.TypeExclusiveToProject;
import moveandcopy.move.packagetomove.TypeExclusiveToProject2;

public class ClassToMove {

	// Semingly unmovable.
	public int fieldToMove;

	// Movable through menu Move Static Members
	// Can be moved to Enum as Enum Constant, too, because the Enum EnumToMoveConstantTo has a fitting constructor
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

	public class InnerClassToMove {
		public int innerFieldToMove;
		public static int INNER_CONSTANT_TO_MOVE;

		public void innerMethodToMove() {
			System.out.println("Inner Method here.");
			System.out.println("innerFieldToMove = " + innerFieldToMove);
		}

		public static void innerStaticMethodToMove() {
			System.out.println("Inner Method here.");
			System.out.println("innerConstantToMove = " + INNER_CONSTANT_TO_MOVE);
		}

		public class InnerInnerClassToMove {
			public int innerInnerFieldToMove;
			public static int INNER_INNER_CONSTANT_TO_MOVE;

			public void innerInnerMethodToMove() {
				System.out.println("Inner-inner Method here.");
				System.out.println("innerInnerFieldToMove = " + innerInnerFieldToMove);
			}

			public static void innerInnerStaticMethodToMove() {
				System.out.println("Inner-inner Method here.");
				System.out.println(INNER_INNER_CONSTANT_TO_MOVE);
			}
		}

	}


}

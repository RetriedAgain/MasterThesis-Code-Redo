package moveandcopy.move.packagetomove;

public class InnerClassToMove {
	private final ClassToMove secret;
	public int innerFieldToMove;
	public static int INNER_CONSTANT_TO_MOVE;

	public InnerClassToMove(ClassToMove secret) {
		this.secret = secret;
	}

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

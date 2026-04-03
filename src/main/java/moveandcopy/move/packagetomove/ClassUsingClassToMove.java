package moveandcopy.move.packagetomove;

public class ClassUsingClassToMove {

	ClassToMove classToMove;
	Secret innerClassToMove;
	Secret.InnerInnerClassToMove innerInnerClassToMove;

	public ClassUsingClassToMove(ClassToMove classToMove, Secret innerClassToMove,
								 Secret.InnerInnerClassToMove innerInnerClassToMove) {
		this.classToMove = classToMove;
		this.innerClassToMove = innerClassToMove;
		this.innerInnerClassToMove = innerInnerClassToMove;
	}

	public void useFieldsOfInnerClassToMove(Secret innerClassToMove) {
		System.out.println(innerClassToMove.innerFieldToMove);
		System.out.println(Secret.INNER_CONSTANT_TO_MOVE);
	}

	public void useMethodsOfInnerClassToMove() {
		innerClassToMove.innerMethodToMove();
		Secret.innerStaticMethodToMove();
	}

	public void useMethodsOfInnerInnerClassToMove() {
		innerInnerClassToMove.innerInnerMethodToMove();
		Secret.InnerInnerClassToMove.innerInnerStaticMethodToMove();
	}

	public void useFieldsOfInnerInnerClassToMove(Secret.InnerInnerClassToMove innerInnerClassToMove) {
		System.out.println(innerInnerClassToMove.innerInnerFieldToMove);
		System.out.println(Secret.InnerInnerClassToMove.INNER_INNER_CONSTANT_TO_MOVE);
	}



	public void useInstanceMethod() {
		classToMove.instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public void useInstanceMethod2() {
		classToMove.instanceMethodToMove(new TypeExclusiveToProject(), new TypeExclusiveToProject2());
	}

	public static void useStaticMethod() {
		ClassToMove.staticMethodToMove();
	}
}

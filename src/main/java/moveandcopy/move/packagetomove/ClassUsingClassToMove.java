package moveandcopy.move.packagetomove;

import moveandcopy.move.InnerClassToMove;

public class ClassUsingClassToMove {

	ClassToMove classToMove;
	InnerClassToMove innerClassToMove;
	InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove;

	public ClassUsingClassToMove(ClassToMove classToMove, InnerClassToMove innerClassToMove,
								 InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove) {
		this.classToMove = classToMove;
		this.innerClassToMove = innerClassToMove;
		this.innerInnerClassToMove = innerInnerClassToMove;
	}

	public void useFieldsOfInnerClassToMove(InnerClassToMove innerClassToMove) {
		System.out.println(innerClassToMove.innerFieldToMove);
		System.out.println(InnerClassToMove.INNER_CONSTANT_TO_MOVE);
	}

	public void useMethodsOfInnerClassToMove() {
		innerClassToMove.innerMethodToMove();
		InnerClassToMove.innerStaticMethodToMove();
	}

	public void useMethodsOfInnerInnerClassToMove() {
		innerInnerClassToMove.innerInnerMethodToMove();
		InnerClassToMove.InnerInnerClassToMove.innerInnerStaticMethodToMove();
	}

	public void useFieldsOfInnerInnerClassToMove(InnerClassToMove.InnerInnerClassToMove innerInnerClassToMove) {
		System.out.println(innerInnerClassToMove.innerInnerFieldToMove);
		System.out.println(InnerClassToMove.InnerInnerClassToMove.INNER_INNER_CONSTANT_TO_MOVE);
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

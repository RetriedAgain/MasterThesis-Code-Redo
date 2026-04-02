package moveandcopy.move.packagetomove;

public class TypeExclusiveToProject {
	void instanceMethodToMove(TypeExclusiveToProject2 typeExclusiveToProject2, ClassToMove classToMove) {
		System.out.println("Move this");
		System.out.println("fieldToMove = " + classToMove.fieldToMove);
		System.out.println("Type1 = " + this);
		System.out.println("Type2 = " + typeExclusiveToProject2);
	}
}

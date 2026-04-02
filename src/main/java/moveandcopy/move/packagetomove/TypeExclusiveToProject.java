package moveandcopy.move.packagetomove;

public class TypeExclusiveToProject {
	void instanceMethodToMove(TypeExclusiveToProject2 typeExclusiveToProject2, ClassToMove secret) {
		System.out.println("Move this");
		System.out.println("fieldToMove = " + secret.fieldToMove);
		System.out.println("Type1 = " + this);
		System.out.println("Type2 = " + typeExclusiveToProject2);
	}
}

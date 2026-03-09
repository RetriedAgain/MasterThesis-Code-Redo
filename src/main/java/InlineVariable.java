public class InlineVariable {

	public static void testInline(int paramVariable) {
		int importantVariable = 5;

		if ((importantVariable + paramVariable) == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}

		if (importantVariable > 3) {
			System.out.println("Good job");
		}

		// importantVariable = importantVariable + paramVariable;
		// System.out.println(importantVariable);
	}
}

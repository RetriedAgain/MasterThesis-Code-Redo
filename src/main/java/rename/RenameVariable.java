package rename;

public class RenameVariable {

	public static void min(int toEnableCommit) {
		int importantVariable = 5;
		System.out.println(importantVariable);
	}

	public static void ifCond() {
		int importantVariable = 5;

		if (importantVariable == 5) {
			System.out.println("Good job");
		}
	}

	public static void ifCondUnder() {
		int importantVariable = 5;

		if (true) {
			System.out.println(importantVariable);
		}
	}


	public static void if_else_if_cond(int paramVariable) {
		int importantVariable = 5;

		if ((importantVariable + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(importantVariable == 5) {
			System.out.println("Bad job");
		}
	}

	public static void if_else_if_under(int paramVariable) {
		int importantVariable = 5;

		if ((importantVariable + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(importantVariable);
		}
	}

	public static void if_else_cond(int paramVariable) {
		int importantVariable = 5;

		if (importantVariable == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public static void if_else_under(int paramVariable) {
		int importantVariable = 5;

		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(importantVariable);
		}
	}

	public static void while_cond() {
		int importantVariable = 5;

		while (importantVariable == 5) {
			System.out.println("Good job");
		}
	}

	public static void while_under() {
		int importantVariable = 5;

		while (true) {
			System.out.println(importantVariable);
			break;
		}
	}

	public static void switch_cond() {
		int importantVariable = 5;

		switch (importantVariable) {
			case 5:
				System.out.println("Good job");
		}
	}

	public static void switch_case_cond(int paramVariable) {
		final int importantVariable = 5;

		switch (paramVariable) {
			case importantVariable:
				System.out.println("Good job");
		}
	}

	public static void switch_case_under(int paramVariable) {
		int importantVariable = 5;

		switch (paramVariable) {
			case 5:
				System.out.println(importantVariable);
		}
	}

	public static void do_while_do() {
		int importantVariable = 5;

		do {
			System.out.println(importantVariable);
			importantVariable++;
			break;
		}
		while (true);
	}

	public static void do_while_cond() {
		int importantVariable = 5;

		do {
			System.out.println("Good job");
		}
		while (importantVariable == 5);
	}

	public static void for_cond() {
		int importantVariable = 5;

		for (int i = 0; i < importantVariable; i++) {
			System.out.println("Good job");
		}
	}

	public static void for_under() {
		int importantVariable = 5;

		for (int i = 0; i < 5; i++) {
			System.out.println(importantVariable);
		}
	}

	public static void for_each_cond() {
		int[] intArray = new int[5];
		for (int i : intArray) {
			System.out.println("Good job");
		}
	}

	public static void for_each_under() {
		int importantVariable = 5;
		int[] intArray = new int[5];

		for (int i : intArray) {
			System.out.println(importantVariable + i);
		}
	}

	public static void nested_loop() {
		int importantVariable = 5;
		int[] intArray = new int[5];

		for (int i : intArray) {
			while(importantVariable == 5) {
				for (int j = 0; j < importantVariable; j++) {
					if (j == importantVariable) {
						System.out.println("Good job");
					}
				}
			}
		}
	}

	public static void redeclaration() {
		int importantVariable = 5;

		System.out.println(importantVariable);
		importantVariable = importantVariable + 10;

		System.out.println(importantVariable);
	}

}

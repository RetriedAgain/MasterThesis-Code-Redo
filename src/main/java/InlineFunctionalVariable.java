import java.lang.reflect.Array;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class InlineFunctionalVariable {

	public static void min() {
		IntSupplier importantVariable = () -> 5;
		System.out.println(importantVariable);
	}

	public static void ifCond() {
		IntSupplier importantVariable = () -> 5;

		if (importantVariable.getAsInt() == 5) {
			System.out.println("Good job");
		}
	}

	public static void ifCondUnder() {
		IntSupplier importantVariable = () -> 5;

		if (true) {
			System.out.println(importantVariable);
		}
	}


	public static void if_else_if_cond(int paramVariable) {
		IntSupplier importantVariable = () -> 5;

		if ((importantVariable.getAsInt() + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(importantVariable.getAsInt() == 5) {
			System.out.println("Bad job");
		}
	}

	public static void if_else_if_under(int paramVariable) {
		IntSupplier importantVariable = () -> 5;

		if ((importantVariable.getAsInt() + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(importantVariable);
		}
	}

	public static void if_else_cond(int paramVariable) {
		IntSupplier importantVariable = () -> 5;

		if (importantVariable.getAsInt() == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public static void if_else_under(int paramVariable) {
		IntSupplier importantVariable = () -> 5;

		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(importantVariable);
		}
	}

	public static void while_cond() {
		IntSupplier importantVariable = () -> 5;

		while (importantVariable.getAsInt() == 5) {
			System.out.println("Good job");
		}
	}

	public static void while_under() {
		IntSupplier importantVariable = () -> 5;

		while (true) {
			System.out.println(importantVariable);
			break;
		}
	}

	public static void switch_cond() {
		IntSupplier importantVariable = () -> 5;

		// switch over the int value provided by the IntSupplier
		switch (importantVariable.getAsInt()) {
			case 5:
				System.out.println("Good job");
				break;
		}
	}

//	public static void switch_case_cond(int paramVariable) {
//		IntSupplier importantVariable = () -> 5;
//
//		switch (paramVariable) {
//			// Not possible to test
//			case importantVariable.getAsInt():
//				System.out.println("Good job");
//		}
//	}

	public static void switch_case_under(int paramVariable) {

		switch (paramVariable) {
			case 5:
				System.out.println((IntSupplier) () -> 5);
		}
	}

	public static void do_while_do() {
		IntSupplier importantVariable = () -> 5;

		do {
			System.out.println(importantVariable);
			break;
		}
		while (true);
	}

	public static void do_while_cond() {
		IntSupplier importantVariable = () -> 5;

		do {
			System.out.println("Good job");
		}
		while (importantVariable.getAsInt() == 5);
	}

	public static void for_cond() {
		IntSupplier importantVariable = () -> 5;

		for (int i = 0; i < importantVariable.getAsInt(); i++) {
			System.out.println("Good job");
		}
	}

	public static void for_under() {
		IntSupplier importantVariable = () -> 5;

		for (int i = 0; i < 5; i++) {
			System.out.println(importantVariable);
		}
	}

	public static void for_each_cond() {
		Supplier<int[]> intArray = () -> new int[5];
		for (int i : intArray.get()) {
			System.out.println("Good job");
		}
	}

	public static void for_each_under() {
		IntSupplier importantVariable = () -> 5;
		int[] intArray = new int[5];

		for (int i : intArray) {
			System.out.println(importantVariable.getAsInt() + i);
		}
	}

	public static void nested_loop() {
		IntSupplier importantVariable = () -> 5;
		int[] intArray = new int[5];

		for (int i : intArray) {
			while(importantVariable.getAsInt() == 5) {
				for (int j = 0; j < importantVariable.getAsInt(); j++) {
					if (j == importantVariable.getAsInt()) {
						System.out.println("Good job");
					}
				}
			}
		}
	}

	public static void redeclaration() {
		IntSupplier importantVariable = () -> 5;

		System.out.println(importantVariable);
		importantVariable = () -> 10;

		System.out.println(importantVariable);
	}
}

public class InlineConstant {
	final static int[] INT_ARRAY = new int[5];


	public static void min() {
		System.out.println(5);
	}

	public static void ifCond() {
		if (5 == 5) {
			System.out.println("Good job");
		}
	}

	public static void ifCondUnder() {
		if (true) {
			System.out.println(5);
		}
	}


	public static void if_else_if_cond(int paramVariable) {
		if ((5 + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(5 == 5) {
			System.out.println("Bad job");
		}
	}

	public static void if_else_if_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(5);
		}
	}

	public static void if_else_cond(int paramVariable) {
		if (5 == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public static void if_else_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(5);
		}
	}

	public static void while_cond() {
		while (5 == 5) {
			System.out.println("Good job");
		}
	}

	public static void while_under() {
		while (true) {
			System.out.println(5);
			break;
		}
	}

	public static void switch_cond() {
		switch (5) {
			case 5:
				System.out.println("Good job");
		}
	}

	public static void switch_case_cond(int paramVariable) {
		switch (paramVariable) {
			case 5:
				System.out.println("Good job");
		}
	}

	public static void switch_case_under(int paramVariable) {
		switch (paramVariable) {
			case 5:
				System.out.println(5);
		}
	}

	public static void do_while_do() {
		do {
			System.out.println(5);
			break;
		}
		while (true);
	}

	public static void do_while_cond() {
		do {
			System.out.println("Good job");
		}
		while (5 == 5);
	}

	public static void for_cond() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Good job");
		}
	}

	public static void for_under() {
		for (int i = 0; i < 5; i++) {
			System.out.println(5);
		}
	}

	public static void for_each_cond() {
		for (int i : INT_ARRAY) {
			System.out.println("Good job");
		}
	}

	public static void for_each_under() {
		for (int i : INT_ARRAY) {
			System.out.println(5 + i);
		}
	}

	public static void nested_loop() {
		for (int i : INT_ARRAY) {
			while(5 == 5) {
				for (int j = 0; j < 5; j++) {
					if (j == 5) {
						System.out.println("Good job");
					}
				}
			}
		}
	}

}

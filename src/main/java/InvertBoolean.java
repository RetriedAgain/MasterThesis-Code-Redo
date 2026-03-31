public class InvertBoolean {

//	boolean boolean_field = true;
	// Same field but static, comment out in test case together with outside usage.
		static boolean secret = false;

	boolean[] booleans = new boolean[5];



	public boolean methodToInvert1() {
		System.out.println("1");
		return true;
	}

	 public void methodToInvert1Usage() {
		boolean usage1 = methodToInvert1();
	}

	public static boolean methodToInvert2() {
		System.out.println("2");
		return true;
	}

	public void methodToInvert2Usage() {
		boolean usage2 = methodToInvert2();
	}


	public void min() {
		System.out.println(!secret);
	}

	public void ifCond() {
		if (!secret) {
			System.out.println("Good job");
		}
	}

	public  void ifCondUnder() {
		if (true) {
			System.out.println(!secret);
		}
	}


	public  void if_else_if_cond(int paramVariable) {
		if (!secret) {
			System.out.println("Good job");
		} else if(secret) {
			System.out.println("Bad job");
		}
	}

	public  void if_else_if_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(!secret);
		}
	}

	public  void if_else_cond(int paramVariable) {
		if (!secret) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public  void if_else_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(!secret);
		}
	}

	public  void while_cond() {
		while (!secret) {
			System.out.println("Good job");
		}
	}

	public  void while_under() {
		while (true) {
			System.out.println(!secret);
			break;
		}
	}

	public  void switch_cond() {
		switch (!secret ? 1: 0) {
			case 1:
				System.out.println("Good job");
		}
	}

	// Not possible because constant expression needed
//	public  void switch_case_cond(Boolean paramVariable) {
//		switch (paramVariable) {
//			case boolean_field:
//				System.out.println("Good job");
//		}
//	}

	public  void switch_case_under(int paramVariable) {
		switch (paramVariable) {
			case 5:
				System.out.println(!secret);
		}
	}

	public  void do_while_do() {
		do {
			System.out.println(!secret);
			break;
		}
		while (true);
	}

	public  void do_while_cond() {
		do {
			System.out.println("Good job");
		}
		while (!secret);
	}

	public  void for_cond() {
		for (int i = 0; !secret; i++) {
			System.out.println("Good job");
		}
	}

	public  void for_under() {
		for (int i = 0; i < 5; i++) {
			System.out.println(!secret);
		}
	}

	public  void for_each_cond() {
		for (boolean b : booleans) {
			System.out.println("Good job");
		}
	}

	public  void for_each_under() {
		for (boolean b : booleans) {
			System.out.println(!secret);
		}
	}

	public  void nested_loop() {
		for (boolean b : booleans) {
			while(!secret) {
				for (int j = 0; !secret; j++) {
					if (!secret) {
						System.out.println("Good job");
					}
				}
			}
		}
	}


}

public class InlineField {
	int[] inline_int_array = new int[5];


	public void min() {
		System.out.println(5);
	}

	public  void ifCond() {
		if (5 == 5) {
			System.out.println("Good job");
		}
	}

	public  void ifCondUnder() {
		if (true) {
			System.out.println(5);
		}
	}


	public  void if_else_if_cond(int paramVariable) {
		if ((5 + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(5 == 5) {
			System.out.println("Bad job");
		}
	}

	public  void if_else_if_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(5);
		}
	}

	public  void if_else_cond(int paramVariable) {
		if (5 == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public  void if_else_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(5);
		}
	}

	public  void while_cond() {
		while (5 == 5) {
			System.out.println("Good job");
		}
	}

	public  void while_under() {
		while (true) {
			System.out.println(5);
			break;
		}
	}

	public  void switch_cond() {
		switch (5) {
			case 5:
				System.out.println("Good job");
		}
	}

//	public  void switch_case_cond(int paramVariable) {
//		switch (paramVariable) {
//			case inline_field:
//				System.out.println("Good job");
//		}
//	}

	public  void switch_case_under(int paramVariable) {
		switch (paramVariable) {
			case 5:
				System.out.println(5);
		}
	}

	public  void do_while_do() {
		do {
			System.out.println(5);
			break;
		}
		while (true);
	}

	public  void do_while_cond() {
		do {
			System.out.println("Good job");
		}
		while (5 == 5);
	}

	public  void for_cond() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Good job");
		}
	}

	public  void for_under() {
		for (int i = 0; i < 5; i++) {
			System.out.println(5);
		}
	}

	public  void for_each_cond() {
		for (int i : inline_int_array) {
			System.out.println("Good job");
		}
	}

	public  void for_each_under() {
		for (int i : inline_int_array) {
			System.out.println(5 + i);
		}
	}

	public  void nested_loop() {
		for (int i : inline_int_array) {
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

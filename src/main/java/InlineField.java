public class InlineField {
	int inline_field = 5;
	int[] inline_int_array = new int[5];


	public void min() {
		System.out.println(inline_field);
	}

	public  void ifCond() {
		if (inline_field == 5) {
			System.out.println("Good job");
		}
	}

	public  void ifCondUnder() {
		if (true) {
			System.out.println(inline_field);
		}
	}


	public  void if_else_if_cond(int paramVariable) {
		if ((inline_field + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(inline_field == 5) {
			System.out.println("Bad job");
		}
	}

	public  void if_else_if_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(inline_field);
		}
	}

	public  void if_else_cond(int paramVariable) {
		if (inline_field == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public  void if_else_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(inline_field);
		}
	}

	public  void while_cond() {
		while (inline_field == 5) {
			System.out.println("Good job");
		}
	}

	public  void while_under() {
		while (true) {
			System.out.println(inline_field);
			break;
		}
	}

	public  void switch_cond() {
		switch (inline_field) {
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
				System.out.println(inline_field);
		}
	}

	public  void do_while_do() {
		do {
			System.out.println(inline_field);
			break;
		}
		while (true);
	}

	public  void do_while_cond() {
		do {
			System.out.println("Good job");
		}
		while (inline_field == 5);
	}

	public  void for_cond() {
		for (int i = 0; i < inline_field; i++) {
			System.out.println("Good job");
		}
	}

	public  void for_under() {
		for (int i = 0; i < 5; i++) {
			System.out.println(inline_field);
		}
	}

	public  void for_each_cond() {
		for (int i : inline_int_array) {
			System.out.println("Good job");
		}
	}

	public  void for_each_under() {
		for (int i : inline_int_array) {
			System.out.println(inline_field + i);
		}
	}

	public  void nested_loop() {
		for (int i : new int[5]) {
			while(inline_field == 5) {
				for (int j = 0; j < inline_field; j++) {
					if (j == inline_field) {
						System.out.println("Good job");
					}
				}
			}
		}
	}

}

package rename.renamefield;

public class RenameField {
	int toRenameField = 5;
	int[] arrayToRename = new int[5];


	public void min() {
		System.out.println(toRenameField);
	}

	public  void ifCond() {
		if (toRenameField == 5) {
			System.out.println("Good job");
		}
	}

	public  void ifCondUnder() {
		if (true) {
			System.out.println(toRenameField);
		}
	}


	public  void if_else_if_cond(int paramVariable) {
		if ((toRenameField + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(toRenameField == 5) {
			System.out.println("Bad job");
		}
	}

	public  void if_else_if_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(toRenameField);
		}
	}

	public  void if_else_cond(int paramVariable) {
		if (toRenameField == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public  void if_else_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(toRenameField);
		}
	}

	public  void while_cond() {
		while (toRenameField == 5) {
			System.out.println("Good job");
		}
	}

	public  void while_under() {
		while (true) {
			System.out.println(toRenameField);
			break;
		}
	}

	public  void switch_cond() {
		switch (toRenameField) {
			case 5:
				System.out.println("Good job");
		}
	}

//	public  void switch_case_cond(int paramVariable) {
//		switch (paramVariable) {
//			case toRenameField: // Constant required
//				System.out.println("Good job");
//		}
//	}

	public  void switch_case_under(int paramVariable) {
		switch (paramVariable) {
			case 5:
				System.out.println(toRenameField);
		}
	}

	public  void do_while_do() {
		do {
			System.out.println(toRenameField);
			break;
		}
		while (true);
	}

	public  void do_while_cond() {
		do {
			System.out.println("Good job");
		}
		while (toRenameField == 5);
	}

	public  void for_cond() {
		for (int i = 0; i < toRenameField; i++) {
			System.out.println("Good job");
		}
	}

	public  void for_under() {
		for (int i = 0; i < 5; i++) {
			System.out.println(toRenameField);
		}
	}

	public  void for_each_cond() {
		for (int i : arrayToRename) {
			System.out.println("Good job");
		}
	}

	public  void for_each_under() {
		for (int i : arrayToRename) {
			System.out.println(toRenameField + i);
		}
	}

	public  void nested_loop() {
		for (int i : arrayToRename) {
			while(toRenameField == 5) {
				for (int j = 0; j < toRenameField; j++) {
					if (j == toRenameField) {
						System.out.println("Good job");
					}
				}
			}
		}
	}

	public int getToRenameField() {
		return toRenameField;
	}

	public void setToRenameField(int toRenameField) {
		this.toRenameField = toRenameField;
	}

	public int[] getArrayToRename() {
		return arrayToRename;
	}

	public void setArrayToRename(int[] arrayToRename) {
		this.arrayToRename = arrayToRename;
	}
}

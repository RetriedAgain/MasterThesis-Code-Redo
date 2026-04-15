package rename.renamefield;

public class RenameField {
	int secret = 5;
	int[] arrayToRename = new int[5];


	public void min() {
		System.out.println(secret);
	}

	public  void ifCond() {
		if (secret == 5) {
			System.out.println("Good job");
		}
	}

	public  void ifCondUnder() {
		if (true) {
			System.out.println(secret);
		}
	}


	public  void if_else_if_cond(int paramVariable) {
		if ((secret + paramVariable) == 5) {
			System.out.println("Good job");
		} else if(secret == 5) {
			System.out.println("Bad job");
		}
	}

	public  void if_else_if_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else if(true) {
			System.out.println(secret);
		}
	}

	public  void if_else_cond(int paramVariable) {
		if (secret == 5) {
			System.out.println("Good job");
		} else {
			System.out.println("Bad job");
		}
	}

	public  void if_else_under(int paramVariable) {
		if (false) {
			System.out.println("Good job");
		} else {
			System.out.println(secret);
		}
	}

	public  void while_cond() {
		while (secret == 5) {
			System.out.println("Good job");
		}
	}

	public  void while_under() {
		while (true) {
			System.out.println(secret);
			break;
		}
	}

	public  void switch_cond() {
		switch (secret) {
			case 5:
				System.out.println("Good job");
		}
	}

//	public  void switch_case_cond(int paramVariable) {
//		switch (paramVariable) {
//			case secret: // Constant required
//				System.out.println("Good job");
//		}
//	}

	public  void switch_case_under(int paramVariable) {
		switch (paramVariable) {
			case 5:
				System.out.println(secret);
		}
	}

	public  void do_while_do() {
		do {
			System.out.println(secret);
			break;
		}
		while (true);
	}

	public  void do_while_cond() {
		do {
			System.out.println("Good job");
		}
		while (secret == 5);
	}

	public  void for_cond() {
		for (int i = 0; i < secret; i++) {
			System.out.println("Good job");
		}
	}

	public  void for_under() {
		for (int i = 0; i < 5; i++) {
			System.out.println(secret);
		}
	}

	public  void for_each_cond() {
		for (int i : arrayToRename) {
			System.out.println("Good job");
		}
	}

	public  void for_each_under() {
		for (int i : arrayToRename) {
			System.out.println(secret + i);
		}
	}

	public  void nested_loop() {
		for (int i : arrayToRename) {
			while(secret == 5) {
				for (int j = 0; j < secret; j++) {
					if (j == secret) {
						System.out.println("Good job");
					}
				}
			}
		}
	}

	public int getSecret() {
		return secret;
	}

	public void setSecret(int secret) {
		this.secret = secret;
	}

	public int[] getArrayToRename() {
		return arrayToRename;
	}

	public void setArrayToRename(int[] arrayToRename) {
		this.arrayToRename = arrayToRename;
	}
}

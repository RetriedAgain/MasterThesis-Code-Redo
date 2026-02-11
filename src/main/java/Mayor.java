import java.util.List;

/**
 * An old class for the initial refactoring-type tests.
 */
public class Mayor {

	private String name;
	private int age;
	private City<List, Integer> city;

	private Mayor(int age, City<List, Integer> city, int popAmount) throws Exception, ArithmeticException {
		this(age, "default", popAmount, 0);
	}

	private Mayor(int age, String addedString, int popAmount, int onlineViewers) throws Exception, ArithmeticException {
		this.name = name;
		this.age = age;
		this.city = city;
		double d = 0.5;
		int i = 10;
	}

	public String getName() {
		double d = 0.5;
		return name;
	}

	public int getAge() {
		return age;
	}

	public City<List, Integer> getCity() {
		return city;
	}

	public void makeSpeechToPopulationAmountEmptyMethod(String typeOfSpeech, double d, int popAmount, int onlineViewers, int inPersonViewers) throws Exception, ArithmeticException, NullPointerException {

	}
}

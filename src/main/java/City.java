import java.util.Collection;

/**
 * An old class used for the initial few refactorings executed.
 * @param <District> Basically useless and only for testing
 * @param <CityNumber> Basically useless and only for testing.
 */
public class City<District extends Collection, CityNumber> {

	private String name;
	private int population;

	public City(int population, String changedName) {
		this.name = changedName;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public int getCoolPopulation() throws Exception {
		return population;
	}
}

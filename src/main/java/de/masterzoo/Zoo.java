package de.masterzoo;

import de.masterzoo.infrastructure.props.Prop;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.partnercompanies.Circus;
import de.masterzoo.partnercompanies.Company;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.List;

/**
 * A big zoo. A big company.
 */
public class Zoo {

	/**
	 * The first day that the zoo paid all of its bills.
	 */
	private final static LocalDate firstDayOfBilling = LocalDate.of(2025, Month.JANUARY, 31);
	/**
	 * The first day that the zoo was open to the public. Not the day that it was open to private investors.
	 */
	private final static LocalDate firstDayOpening = LocalDate.of(2025, Month.JANUARY, 1);

	// Accounting
	private int averageMonthlyCostsByYear;
	private int averageMonthlyRevenueByYear;
	private double accountingBudget;
	private double hrBudget;
	private double legalBudget;
	private double zookeepingBudget;
	private double securityBudget;

	private HashMap<YearMonth, Integer> collectedRentInYearMonth = new HashMap<>();

	// HR
	private int numberOfEmployees;


	// Legal


	// Zoo-Keeping

	private List<Animal> animalsInZoo;
	private List<Prop> propsInZoo;

	// Security


	// Partner-Companies
	private List<Company> partnerCompanies;


	public Zoo(int averageMonthlyCostsByYear, int averageMonthlyRevenueByYear, List<Animal> animalsInZoo, List<Prop> propsInZoo,  List<Company> partnerCompanies) {
		this.averageMonthlyCostsByYear = averageMonthlyCostsByYear;
		this.averageMonthlyRevenueByYear = averageMonthlyRevenueByYear;
		this.animalsInZoo = animalsInZoo;
		this.propsInZoo = propsInZoo;
		this.partnerCompanies = partnerCompanies;
	}

	/**
	 * Creates circus as of now.
	 */
	public void enableAndCreateCircus() {
		int freeNumOfEmployees = calcFreeNumOfEmployees();
		int freeNumOfCircusBudget = calcFreeNumOfCircusBudget();
		this.partnerCompanies.add(new Circus(freeNumOfEmployees, freeNumOfCircusBudget));
	}

	/**
	 * This adds the rent collected in a specific month to the accounting budget.
	 * @param partnerCompanies The companies that the rent was collected from in the specific YearMonth.
	 * @param yearMonth The YearMonth that the rent was collected in.
	 */
	public void addRentOfMonthToBudget(List<Company> partnerCompanies, YearMonth yearMonth) {
		try {
			this.accountingBudget += collectRentInYearMonth(partnerCompanies, yearMonth);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * This method collects the rent of each company given in the list of partnercompanies for a given YearMonth.
	 * @param partnerCompanies List of partner companies that the rent is to be collected from.
	 * @param yearMonth The yearmonth in which the rentcollection is to be done.
	 * @return The total amount of collectedRent.
	 */
	public int collectRentInYearMonth(List<Company> partnerCompanies, YearMonth yearMonth) throws NullPointerException, Exception {
		HashMap<YearMonth, Integer> collectedRentInYearMonth = new HashMap<>();
		int collectedRent = 0;
		for (Company partnerCompany : partnerCompanies) {
			if (partnerCompany instanceof Circus) {
				Circus partnerCircus = (Circus) partnerCompany;
				collectedRent += partnerCircus.payRent();
			}
		}

		if (collectedRent < 0) {
			throw new Exception("Collected rent is negative");
		} else if (partnerCompanies.equals(null)) {
			throw new NullPointerException("partnerCompanies is null");
		}
		collectedRentInYearMonth.put(yearMonth, collectedRent);
		return collectedRent;
	}

	private int calcFreeNumOfCircusBudget() {
		return 10_000;
	}

	private int calcFreeNumOfWildLifeProtectionBudget() {
		return 10_000;
	}

	private int calcFreeNumOfSavingsBudget() {
		return 10_000;
	}

	private int calcFreeNumOfEmployeeETFBudget() {
		return 10_000;
	}

	private int calcFreeNumOfEmployees() {
		return 10;
	}

	public void calculateInitialBudgetDistribution() {
		this.accountingBudget = 200_000 * 0.2;
		this.hrBudget = 200_000 * 0.2;
		this.legalBudget = 200_000 * 0.2;
		this.zookeepingBudget = 200_000 * 0.2;
		this.securityBudget = 200_000 * 0.2;
	}

	public boolean didSomeoneBlowBudget() {
		return this.accountingBudget > 200_000
			|| this.hrBudget > 200_000
			|| this.legalBudget > 200_000
			|| this.zookeepingBudget > 200_000
			|| this.securityBudget > 200_000;
	}

	public int calculateAverageMonthlyCostsByYear(Year year) {
		//TODO: Add calculation here
		this.averageMonthlyCostsByYear = 0;
		return this.averageMonthlyCostsByYear;
	}

	public int calculateAverageMonthlyRevenueByYear(Year year) {
		//TODO: Add calculation here
		this.averageMonthlyRevenueByYear = 0;
		return this.averageMonthlyRevenueByYear;
	}

	public int dummCalculateSomethingAboutProfitLater(Year year) {
		Month[] months = Month.values();
		/*listOfProfits //TODO: Possibly make this more complicated
		for (Month month : Month.values()) {
			this.averageMonthlyRevenueByYear - this.averageMonthlyCostsByYear;
		}
		*/
		return this.averageMonthlyRevenueByYear - this.averageMonthlyCostsByYear;
	}

	public boolean dummy() {
		if (this.averageMonthlyRevenueByYear - this.averageMonthlyCostsByYear > 0) {
			System.out.println("expand business!");
		} else if (this.averageMonthlyRevenueByYear - this.averageMonthlyCostsByYear < 0) {
			System.out.println("expand business!");
		}
		return true;
	}

	public boolean profitableMonth() {
		if (this.averageMonthlyRevenueByYear > this.averageMonthlyCostsByYear) {
			return true;
		}
		return false;
	}

	public int getAverageMonthlyCostsByYear() {
		return averageMonthlyCostsByYear;
	}

	public void setAverageMonthlyCostsByYear(int averageMonthlyCostsByYear) {
		this.averageMonthlyCostsByYear = averageMonthlyCostsByYear;
	}

	public int getAverageMonthlyRevenueByYear() {
		return averageMonthlyRevenueByYear;
	}

	public void setAverageMonthlyRevenueByYear(int averageMonthlyRevenueByYear) {
		this.averageMonthlyRevenueByYear = averageMonthlyRevenueByYear;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public List<Animal> getAnimalsInZoo() {
		return animalsInZoo;
	}

	public void setAnimalsInZoo(List<Animal> animalsInZoo) {
		this.animalsInZoo = animalsInZoo;
	}

	public List<Prop> getPropsInZoo() {
		return propsInZoo;
	}

	public void setPropsInZoo(List<Prop> propsInZoo) {
		this.propsInZoo = propsInZoo;
	}

	public HashMap<YearMonth, Integer> getCollectedRentInYearMonth() {
		return collectedRentInYearMonth;
	}

	public void setCollectedRentInYearMonth(HashMap<YearMonth, Integer> collectedRentInYearMonth) {
		this.collectedRentInYearMonth = collectedRentInYearMonth;
	}
}

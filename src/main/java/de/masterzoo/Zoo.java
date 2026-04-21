package de.masterzoo;

import de.masterzoo.infrastructure.props.Prop;
import de.masterzoo.groups.animalia.Animal;
import de.masterzoo.partnercompanies.Circus;
import de.masterzoo.partnercompanies.Company;
import org.jetbrains.annotations.NonNls;

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

	@NonNls
	private static final String WELCOME_GREETING = "Welcome to the Zoo!";

	// Accounting
	private double averageMonthlyCostsByYear;
	private double averageMonthlyRevenueByYear;
	private double accountingBudget;
	private double hrBudget;
	private double legalBudget;
	private double zookeepingBudget;
	private double securityBudget;

	private HashMap<YearMonth, Double> collectedRentInYearMonth = new HashMap<YearMonth, Double>();

	// HR
	private int numberOfEmployees;


	// Legal


	// Zoo-Keeping

	private List<Animal> animalsInZoo;
	private List<Prop> propsInZoo;

	// Security


	// Partner-Companies
	private List<Company> partnerCompanies;

	public Zoo() {

	}

	public Zoo(double averageMonthlyCostsByYear, double averageMonthlyRevenueByYear, List<Animal> animalsInZoo,
			   List<Prop> propsInZoo,  List<Company> partnerCompanies) {
		this.averageMonthlyCostsByYear = averageMonthlyCostsByYear;
		this.averageMonthlyRevenueByYear = averageMonthlyRevenueByYear;
		this.animalsInZoo = animalsInZoo;
		this.propsInZoo = propsInZoo;
		this.partnerCompanies = partnerCompanies;
	}

	private static void welcomeCustomers() {
		System.out.println(WELCOME_GREETING);
	}

	private static void useWelcomeCustomers() {
		welcomeCustomers();
		System.out.println("That was our greeting message!");
	}

	/**
	 * Creates circus as of now.
	 */
	public void enableAndCreateCircus() {
		int freeNumOfEmployees = calcFreeNumOfEmployees();
		double freeNumOfCircusBudget = calcFreeNumOfCircusBudget();
		this.partnerCompanies.add(new Circus(freeNumOfEmployees, freeNumOfCircusBudget));
	}

	/**
	 * This adds the rent collected in a specific month to the accounting budget.
	 * @param partnerCompanies The companies that the rent was collected from in the specific YearMonth.
	 * @param yearMonth The YearMonth that the rent was collected in.
	 */
	public void addRentOfMonthToBudget(List<Company> partnerCompanies, YearMonth yearMonth) {
		this.accountingBudget += collectRentInYearMonth(partnerCompanies, yearMonth);
	}

	/**
	 * This method collects the rent of each company given in the list of partnercompanies for a given YearMonth.
	 * @param partnerCompanies List of partner companies that the rent is to be collected from.
	 * @param yearMonth The yearmonth in which the rentcollection is to be done.
	 * @return The total amount of collectedRent.
	 */
	private double collectRentInYearMonth(List<Company> partnerCompanies, YearMonth yearMonth) {
		HashMap<YearMonth, Double> collectedRentInYearMonth = new HashMap<>();
		double collectedRent = 0;
		for (Company partnerCompany : partnerCompanies) {
			if (partnerCompany instanceof Circus) {
				Circus partnerCircus = (Circus) partnerCompany;
				collectedRent += partnerCircus.payRent();
			}
		}
		collectedRentInYearMonth.put(yearMonth, collectedRent);
		return collectedRent;
	}

	private double calcFreeNumOfCircusBudget() {
		return 10000;
	}

	private double calcFreeNumOfWildLifeProtectionBudget() {
		return 10000;
	}

	private double calcFreeNumOfSavingsBudget() {
		return 10000;
	}

	private double calcFreeNumOfEmployeeETFBudget() {
		return 10_000;
	}

	private int calcFreeNumOfEmployees() {
		return 10;
	}

	public void calculateInitialBudgetDistribution() {
		this.accountingBudget = this.hrBudget = this.legalBudget = this.zookeepingBudget = this.securityBudget = 0;

		int test = 200_000;
		this.accountingBudget = test * 0.2;

		// Extract 200_000
		this.setHrBudget(200_000 * 0.2);
		this.legalBudget = 200_000 * 0.2;
		this.zookeepingBudget = 200_000 * 0.2;
		this.securityBudget = 200_000 * 0.2;
	}

	public boolean didSomeoneBlowBudget() {
		return this.accountingBudget > 200_000
			|| this.getHrBudget() > 200_000
			|| this.legalBudget > 200_000
			|| this.zookeepingBudget > 200_000
			|| this.securityBudget > 200_000;
	}

	public double calculateAverageMonthlyCostsByYear(Year year) {
		//TODO: Add calculation here
		this.averageMonthlyCostsByYear = 0;
		return this.averageMonthlyCostsByYear;
	}

	public double calculateAverageMonthlyRevenueByYear(Year year) {
		//TODO: Add calculation here
		this.averageMonthlyRevenueByYear = 0;
		return this.averageMonthlyRevenueByYear;
	}

	public double dummCalculateSomethingAboutProfitLater(Year year) {
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

	public double getAverageMonthlyCostsByYear() {
		return averageMonthlyCostsByYear;
	}

	public void setAverageMonthlyCostsByYear(double averageMonthlyCostsByYear) {
		this.averageMonthlyCostsByYear = averageMonthlyCostsByYear;
	}

	public double getAverageMonthlyRevenueByYear() {
		return averageMonthlyRevenueByYear;
	}

	public void setAverageMonthlyRevenueByYear(double averageMonthlyRevenueByYear) {
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

	public HashMap<YearMonth, Double> getCollectedRentInYearMonth() {
		return collectedRentInYearMonth;
	}

	public void setCollectedRentInYearMonth(HashMap<YearMonth, Double> collectedRentInYearMonth) {
		this.collectedRentInYearMonth = collectedRentInYearMonth;
	}

	private double getHrBudget() {
		return hrBudget;
	}

	private void setHrBudget(double hrBudget) {
		this.hrBudget = hrBudget;
	}
}

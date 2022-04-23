package dependency;

public class TaxCalculator2022 implements TaxCalculator{

	private double taxableIncome;

	public TaxCalculator2022(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	@Override
	public double calculateTax() {
		return 0.3 * taxableIncome;
	}
	
	
	
}

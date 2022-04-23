package dependency;

public class TaxCalculator2021 implements TaxCalculator{

	private double taxableIncome;
	
	public TaxCalculator2021(double taxableIncome) {

		this.taxableIncome = taxableIncome;
	}

	@Override
	public double calculateTax() {
		
		return 0.4 * taxableIncome;
	}

}

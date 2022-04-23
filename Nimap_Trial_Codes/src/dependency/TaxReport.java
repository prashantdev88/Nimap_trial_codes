package dependency;

public class TaxReport {

	private TaxCalculator calculator;

//	public TaxReport(TaxCalculator calculator) {
//		this.calculator = calculator;
//	}
	
	public void setTaxCalculator(TaxCalculator calculator) {
		this.calculator = calculator;
	}
	
//	public void show() {
//		System.out.println(this.calculator.calculateTax()+" is the TAX");
//	}
	
	public void show(TaxCalculator calculator) {
		System.out.println(calculator.calculateTax()+" is the TAX");
	}
}

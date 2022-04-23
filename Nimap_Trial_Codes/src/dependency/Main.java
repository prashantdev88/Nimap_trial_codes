package dependency;

public class Main {

	// Dependency Injection Using Constructor
	
	// As the TaxReport is not dependent on Class TaxCalculator2022 but is dependent on interface TaxCalculator 
	// So change in Class TaxCalculator2022 does not need to RECOMPILE TaxReport just the class TaxCalculator2022
	public static void main(String[] args) {

		// Constructor Dependency Injection
//		TaxCalculator2022 obj = new TaxCalculator2022(2_000_000);
//		TaxReport report = new TaxReport(obj);
//		report.show();
//		
		
		// Setter Dependency Injection
//		TaxCalculator2021 obj1 = new TaxCalculator2021(1_000_000);
//		report.setTaxCalculator(obj1);
//		report.show();
		
		
		// Method Dependency Injection
		TaxReport report = new TaxReport();
		report.show(new TaxCalculator2022(20_000_000));
							
	}
}

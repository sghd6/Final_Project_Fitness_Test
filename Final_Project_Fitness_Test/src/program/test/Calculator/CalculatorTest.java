package program.test.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import program.main.Calculator.Calculator;
import program.main.UserClasses.Athlete;

class CalculatorTest {
/////The follow tests the functions of a Calculator class using an example from the Athlete Subclass
	private Calculator t = new Calculator();
	Athlete Shelby = new Athlete("Shelby",20,152.4,56.8);
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	
///Test confirms values were successfully created
	@Test
	void testCalculator() {
		assertEquals("User [name= Shelby, age= 20,height= 152.4,weight= 56.8]", Shelby.toString());
	}
	
//Tests BMI ranking using an example class
	@Test
	void testBmiRanking() {
		assertEquals("Your bmi is within the healthy/normal range",t.bmiRanking(Shelby));
	}

////Tests BMI calculation using an example class
	@Test
	void testShowBMI() {
		assertEquals(24,t.showBMI(Shelby));
		
////Makes sure 152.4 cm converts to 5ft and 0 inches
	}
	@Test
	 void testMetricToImperialDisplay() {
		 assertEquals("5ft 0in",t.metricToImperialHeightDisplay(Shelby));
	 }
	
	@Test
	void metricToImperialWeightConverter() {
		assertEquals("125lbs", t.metricToImperialWeightConverter(Shelby));
	}

}

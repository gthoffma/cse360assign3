package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	//Test the calculator methods to test inheritance
	@Test
	void testNoPerformedOperations() {
		Calculator myCalculator = new Calculator();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}
	
	@Test
	void testBasicAddition() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(5);
		assertTrue(myCalculator.toString().equals("0 + 5") && myCalculator.getTotal() == 5);
	}

	@Test
	void testBasicSubtraction() {
		Calculator myCalculator = new Calculator();
		myCalculator.subtract(3);
		assertTrue(myCalculator.toString().equals("0 - 3") && myCalculator.getTotal() == -3);
	}
	
	@Test
	void testMultipleOperations() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(4);
		myCalculator.subtract(2);;
		myCalculator.add(5);
		assertTrue(myCalculator.toString().equals("0 + 4 - 2 + 5") && myCalculator.getTotal() == 7);
	}
	
	@Test 
	void testClear(){
		Calculator myCalculator = new Calculator();
		myCalculator.clear();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}
	
	@Test
	void testAllCalcComponents() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(5);
		myCalculator.subtract(10);
		myCalculator.clear();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}
	
	@Test
	void testMult() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(5);
		myCalculator.mult(2);
		myCalculator.mult(3);
		assertTrue(myCalculator.toString().equals("0 + 5 * 2 * 3") && myCalculator.getTotal() == 30);
	}
	
	@Test
	void testDiv() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(50);
		myCalculator.div(2);
		myCalculator.div(3);
		assertTrue(myCalculator.toString().equals("0 + 50 / 2 / 3") && myCalculator.getTotal() == 8);
	}
	
	@Test
	void testPower() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(2);
		myCalculator.power(2);
		myCalculator.power(3);
		assertTrue(myCalculator.toString().equals("0 + 2 ^ 2 ^ 3") && myCalculator.getTotal() == 64);
	}
	
	@Test
	void testAll() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(20);
		myCalculator.subtract(2);
		myCalculator.div(6);
		myCalculator.mult(2);
		myCalculator.power(2);
		assertTrue(myCalculator.toString().equals("0 + 20 - 2 / 6 * 2 ^ 2") && myCalculator.getTotal() == 36);
	}
	
}

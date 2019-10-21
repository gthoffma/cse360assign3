package cse360assign3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	void testNoPerformedOperations() {
		AddingMachine myCalculator = new AddingMachine();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}
	
	@Test
	void testBasicAddition() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		assertTrue(myCalculator.toString().equals("0 + 5") && myCalculator.getTotal() == 5);
	}

	@Test
	void testBasicSubtraction() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.subtract(3);
		assertTrue(myCalculator.toString().equals("0 - 3") && myCalculator.getTotal() == -3);
	}
	
	@Test
	void testMultipleOperations() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);;
		myCalculator.add(5);
		assertTrue(myCalculator.toString().equals("0 + 4 - 2 + 5") && myCalculator.getTotal() == 7);
	}
	
	@Test 
	void testClear(){
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.clear();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}
	
	@Test
	void testAllComponents() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(5);
		myCalculator.subtract(10);
		myCalculator.clear();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}
}

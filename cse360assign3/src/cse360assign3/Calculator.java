/*
 * Name: Garrett Hoffmann
 * Class ID: 2019Fall-T-CSE360-70641
 * Assignment Number: 3
 * Description: builds on addingMachine class to
 *  have mult, div, and power functions
 */


package cse360assign3;

public class Calculator extends AddingMachine{

	/**
	 * changes the value of "total" by multiplying
	 *  the parameter to the member "total." Also updates the member
	 *  string operationsString accordingly
	 * @param value is the value to be multiplied to "total"
	 * @return none
	 */
	public void mult(int value) {
		total = total * value;
		operationsString = operationsString + " * " + value;
	}
	
	/**
	 * changes the value of "total" by dividing
	 *  the member "total" by value. Also updates the member
	 *  string operationsString accordingly
	 * @param value is the value that divides "total"
	 * @return none
	 */
	public void div(int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total = total/value;
		}
		operationsString = operationsString + " / " + value;
	}
	
	/**
	 * changes the value of "total" by raising
	 *  the member "total" by value. Also updates the member
	 *  string operationsString accordingly
	 * @param value is the power to raise "total"
	 * @return none
	 */
	public void power(int value) {
		if(value < 0) {
			total = 0;
		}
		else {
			int result = total;
			for(int i = 1; i < value; i++) {
				result = result * total;
			}
			total = result;			
		}
		operationsString = operationsString + " ^ " + value;
	}
}

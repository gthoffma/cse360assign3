/*
 * Name: Garrett Hoffmann
 * Class ID: 2019Fall-T-CSE360-70641
 * Assignment Number: 3
 * Description: provides a class that allows basic math operations
 *  on a member integer and can output the result of the operations
 *  as well as the order the operations were done.
 */

package cse360assign3;
/**
 * AddingMachine is a class that holds a private
 *  integer holding the result of basic math operations done by
 *  its private methods. Can then return the order of operations
 *  performed on the member integer in the toString method
 */
public class AddingMachine {

	/**
	 * total is a member integer that hold the result of the operations
	 *  performed.
	 */
	protected int total;
	/**
	 * operationsString is a string that holds the operations
	 *  done on total.
	 */
	protected String operationsString;
	/**
	 * public constructor that assigns the "total" member variable
	 *  to 0. Also sets the string operationsString to "0"
	 * @param none
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		operationsString = "0";
	}
	
	/**
	 * getTotal returns the private member total, which holds the
	 *  result of all operations performed
	 * @param none
	 * @return an integer that is the total value of all operations
	 *  performed
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * changes the value of "total" by adding
	 *  the parameter to the member "total." Also updates the member
	 *  string operationsString accordingly
	 * @param value is the value to be added to "total"
	 * @return none
	 */
	public void add (int value) {
		total = total + value;
		operationsString = operationsString + " + " + value;
	}
	
	/**
	 * changes the value of "total" by subtracting
	 *  the parameter from the member "total." Also updates the member
	 *  string operationsString accordingly
	 * @param value is the value to be subtracted from "total"
	 * @return none
	 */
	public void subtract (int value) {
		total = total - value;
		operationsString = operationsString + " - " + value;
	}
		
	/**
	 * returns a string that represents the operations performed on
	 *  "total" in order, which is held in operationsString
	 * @param none
	 * @return a string that represents the operations
	 *  performed on "total"
	 */
	public String toString () {
		return operationsString;
	}

	/**
	 * sets the value of "total" to 0 and sets the
	 *  value of operationsString to "0" as well.
	 *  @param none
	 *  @return none
	 */
	public void clear() {
		total = 0;
		operationsString = "0";
	}
}

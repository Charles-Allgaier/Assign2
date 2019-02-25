/**
* @author Charles Allgaier
* @classID: 313
* @assignment: #2
* @version: 2.0
* @description: This program performs the various functions of a calculator. (For example: add, subtract, divide, etc.)
*/

package cse360assign2;

public class Calculator {
	
	/**
	* Adds, subtracts, multiplies and divides integer values. 
	* 
	* @param total   The total integer value after the arithmetic 
	*                operations are performed.
	*/
	private int total;
	
	/**
	* Constructs a Calculator class when called.
	*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	* Displays the value of the total parameter.
	*
	* @return   The total parameter.
	*/
	public int getTotal () {
		System.out.println(total);
		return total;
	}
	
	/**
	* Adds the integer value to the total parameter.
	* 
	* @param value   The value to be added.
	*/
	public void add (int value) {
		total = total + value;
	}
	
	/**
	* Subtracts the integer value from the total parameter. 
	* 
	* @param value   The value to be subtracted.
	*/
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	* Multiplies the total parameter by the integer value.
	* 
	* @param value   The value to be multiplied by.
	*/
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	* Divides the total parameter by the integer value. 
	* 
	* @param value   The value to be divided by.
	*/
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		if(value != 0)
		{
		total = total / value;
		}
	}
	
	/**
	* Returns a string containing all operations performed on the
	* total parameter. 
	* 
	* @return   String containing all operations performed.
	*/
	public String getHistory () {
		return "";
	}
}

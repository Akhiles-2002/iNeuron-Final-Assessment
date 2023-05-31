/*
Question 3 : Write a Java programme that takes an integer from the user and throws an exception
if it is negative.Demonstrate Exception handling of same program as solution.
 */

package in.com.main;

import java.util.Scanner;

class NegativeNumberException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NegativeNumberException(String message)
	{
		super(message);  //Sending message to parent class constructor
		
		/*
		 class Exception{
		 
		 	private String message;
		 	public Exception(String message){
		 		this.message = message;
		 	}
		 
		 	public String getMessage(){
		 		return message;
		 	}
		 }
		 */
	}
	
}

public class NegativeNumberExceptionDemo_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter an Number :: ");
			int number = scanner.nextInt();
			
			if(number < 0) {
				throw new NegativeNumberException("Negative Number...."); //Passing value through constructor
			}
			
			System.out.println("You Entered :: "+number);
			
		}catch(NegativeNumberException nne) {
			System.out.println("Exception Caught : "+nne.getMessage()); //Retrieving the message using getMessage
		}catch(Exception e) {
			System.out.println("An Error Occured : "+e.getMessage());
		}finally {
			scanner.close();
		}

	}

}

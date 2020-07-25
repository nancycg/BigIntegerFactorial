import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Nancy
 */
public class Factorial {

	public static void main(String[] args) {

		System.out.println("Welcome to my factorial program!");
		System.out.println("Please choose from the following:");
		System.out.println("1. Run Program");
		System.out.println("2. Exit Program");
		System.out.println("===>");

		//first step is to take user input to run or exit the program. 
		String strInput;
		
		//scanner object is used to take user input.
		Scanner scan = new Scanner(System.in);
		strInput = scan.nextLine();
		
		//Use a Switch/Case block that executes depending upon menu choice 
		switch(strInput){
		case "1":
			menuOptions(); //Calling this method to display further menu options.
			break;
		case "2":
			System.out.println("Exit.");
			System.exit(0);  //terminating the program here only.
		default:
			System.out.println("Wrong input. Please try again.");
			System.exit(0);  //terminating the program.
		}
		scan.close();
	}

	/*
	 * This method is static because static can call only static
	 * and we are calling it from static main method without creating and instance of class.
	 * Static is a keyword in java.
	 */
	public static void menuOptions() {

		String yesOrNo;
		Scanner scan = new Scanner(System.in);
		
		// '/n' This is used to insert a newline in the text at this point.
		System.out.println("\nThis program will determine the factorial value of positive integers.\n");
		
		//Implementing a do...while loop to run the program again.
		do{
			yesOrNo = "";
			System.out.println("\nThe starting number is 1."); 
			System.out.println("Please enter an ending integer value: ");
			
			//second step is to take user input for the ending integer value. 
			int input;
			input = scan.nextInt();
	
			//Computing factorial by calling computeFactorial() method.
			computeFactorial(input);
			
			System.out.println("Run factorial program again? (Y for Yes, N for No):");
			yesOrNo = scan.next();
			
		}while(yesOrNo.equalsIgnoreCase("Y"));
		
		//freeing the scanner object.
		scan.close();
		System.out.println("Thank you for using the factorial program! Goodbye!");
	}

	public static void computeFactorial(int userInput) {
		BigInteger fact = BigInteger.ONE;
		
		//Using a for loop to determine and output the data 
		for(int i = 1; i <= userInput; i++){
			fact = fact.multiply(BigInteger.valueOf(i));
			System.out.println(i + "! = " + fact);			
		}
	}

}

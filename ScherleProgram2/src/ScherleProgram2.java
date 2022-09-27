// Application:		Program 2
// Name:			Cody Scherle
// GitHub User:		CodyScherle
// Date:			Sep 22, 2022
// Version:			1.0
// Description		Program 2
import java.util.Scanner;
public class ScherleProgram2 {

	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner (System.in);
		// First Starting off with inputing any number that the user choose without explaining what it is for
		System.out.println("Type any number ");
		int firstNumber = Keyboard.nextInt();
		
		System.out.println("Type another number that is larger than your first number ");
		int secondNumber = Keyboard.nextInt();
		
		System.out.println("Type a third number ");
		int thirdNumber = Keyboard.nextInt();
		// I offered a main menu for the user to decide on an option
		System.out.println("Welcome! Please input an option");
		System.out.println("1.) Play ");
		System.out.println("2.) Settings ");
		System.out.println("3.) How to play ");
		System.out.println("4.) Quit");
		System.out.println("");
		// using a switch statement to indicate what option they picked
		int MenuChoice = Keyboard.nextInt();
		
		switch (MenuChoice) {
		case 1: {
			System.out.println("Loading..."); 
			System.out.println("Imput an option");
			System.out.println(" ");
			System.out.println("1.) Add");
			System.out.println("2.) Subtract");
			System.out.println("3.) Multiply");
			System.out.println("4.) Divide");
			// Preparing answers from user
			int Signchoice = Keyboard.nextInt();
			int add = firstNumber + secondNumber;
			int subtract = secondNumber - firstNumber;
			int multiply = firstNumber * secondNumber;
			float divide = secondNumber / firstNumber;
			// Another switch statement for input and if statements when using operations to compare to the third number they chose
			switch (Signchoice) {
			case 1: 
				System.out.println("Your first and second number add to " + add);
				if (add>=thirdNumber)
					System.out.println("Your first and second number add to be greater than or equil to " + thirdNumber);
				else
					System.out.println("Your first and second numer add to be less than " + thirdNumber);
				break;
			case 2:
				System.out.println("Your first and second number subtract to " + subtract);
				if (subtract>=thirdNumber)
					System.out.println("Your first and second number subtract to be greater than or equil to " + thirdNumber);
				else
					System.out.println("Your first and second number subtract to be less than " + thirdNumber);
				break;
			case 3:
				System.out.println("Your first and second number multiply to " + multiply);
				if (multiply>=thirdNumber)
					System.out.println("Your first and second number multiply to be greater than or equil to " + thirdNumber);
				else
					System.out.println("Your first and second number multiply to be less than " + thirdNumber);
				break;
			case 4:
				System.out.println("Your first and second number divide to " + divide);
				if (divide>=thirdNumber)
					System.out.println("Your first and second number divide to be greater than or equil to " + thirdNumber);
				else
					System.out.println("Your first and second number divide to be less than " + thirdNumber);
				break;
				default:
					System.out.println("Your number does not match an option ");
			
			// Thanking them for playing the game
			}
			System.out.println("Thank you for playing!");
		break;	
			}
		case 2: {
			System.out.println("Video Settings");
			System.out.println("Audio Settings");
			System.out.println("Back");
			break; }
		case 3: {
			System.out.println("Your first two numbers you've selected will either add, subtract, "
					+ "multiply, or devide and see if your number is greater than or less than "
					+ "your last number.");
			break; }
		case 4: {
			System.out.println("Exiting...");
			break; }
		default:
			System.out.println("Your number does not match an option");
		
		}
		}
		
		
		
		
		
}

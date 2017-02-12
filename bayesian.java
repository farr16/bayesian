import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Takes input from user about a probability problem and solves it by applying Bayes' Theorem
 *
 * @author       Matthew Farr
 */
public class Bayesian
{
	public static void main(String[] args)
	{
		System.out.println("\nWelcome to the Bayes Theorem Calculator");
		System.out.println("This will calculate P(A|B), or the probability of A being true, given that B is true");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nPlease input a name for A (recommended length: between 1 and 5 characters)");
		System.out.print("A: ");
		String aliasA = input.next();
		
		System.out.println("\nPlease input a name for B (recommended length: between 1 and 5 characters)");
		System.out.print("B: ");
		String aliasB = input.next();
		
		System.out.println("\nSolving for P(" + aliasA + " | " + aliasB + ")");
		
		float probA, probBgivenA;
		
		System.out.print("\nInput probability of " + aliasA + "\nP(" + aliasA + "): ");
		try 
		{
			probA = input.nextFloat();
		} catch (InputMismatchException e)
		{
			System.out.println("\nInvalid input, exiting");
			input.close();
			return;
		}
		
		System.out.print("\nInput probability of " + aliasB + " given " + aliasA + "\nP(" + aliasB + " | " + aliasA + "): ");
		try
		{
			probBgivenA = input.nextFloat();
		} catch (InputMismatchException e)
		{
			System.out.println("Invalid input, exiting");
			input.close();
			return;
		}
		
		System.out.println("Choose next available piece of info:");
		System.out.print("\n\n1) P(" + aliasB + ")\nOR\n2) P(" + aliasB + " | NOT " + aliasA + ")\n");
		System.out.print("\nInput 1 or 2: ");
		
		int choice;
		try
		{
			choice = input.nextInt();
		} catch (InputMismatchException e)
		{
			System.out.println("Invalid input, exiting");
			input.close();
			return;
		}
		
		// Debug test code, delete when done testing input
		System.out.print("\n\nP(" + aliasA + ") = " + probA + "\nP(" + aliasB + " | " + aliasA + ") = " + probBgivenA + "\nChoice = " + choice);
		input.close();
		return;
	}
}
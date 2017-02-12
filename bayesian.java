import java.util.Scanner;

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
	}
}
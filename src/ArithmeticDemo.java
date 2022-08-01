import java.util.Scanner;

public class ArithmeticDemo 
{
	public static void main (String [] args)
	{
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an double      >> ");
		firstNumber = input.nextInt();
		System.out.print("Please enter another double >> ");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
//		average = (double)sum/2; //explicit casting
		/*average = (double)(sum/2); in this case result of "sum/2" calculated first
		          and the result is an Integer. Then the whole number casts to a 
		          double, but the fractional part is already lost.*/
		average = sum/2.0; /*in this case result is double because of 
		implicit casting*/
		System.out.println(firstNumber +" + "+ secondNumber +" is "+ sum);
		System.out.println(firstNumber +" - "+ secondNumber +" is "+ difference);
		System.out.println("The average between " +firstNumber+ 
				" and " +secondNumber+ " is " +average);
		
		
	}
}

import java.util.Scanner;

public class Lab02c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		double firstInteger = in.nextInt();
		
		System.out.print("Enter the second integer: ");
		double secondInteger = in.nextInt();
		
		double sum = firstInteger + secondInteger;
		double subtraction = firstInteger - secondInteger;
		double product = firstInteger * secondInteger;
		double division = firstInteger / secondInteger;
		double remainder = firstInteger % secondInteger;
		
		System.out.println("Sum of two integers is " + sum);
		System.out.println("Difference of two integers is " + subtraction);
		System.out.println("Product of two integers is " + product);
		System.out.println("Division of two integers is " + division);
		System.out.println("Remainder of the division is " + remainder);
		
	}

}

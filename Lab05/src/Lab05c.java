import java.util.Scanner;
/**This program is a simple calculator.
 * @author BERKYILDIZ
 *14.11.2016
 */
public class Lab05c {

	
	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		
		String operation;
		double number;
		double result;
		int sentinel;
		int n;
		int factorial;
		double taylor;
		
		System.out.println("Welcome to Simple Calculator");
		
		factorial = 1;
		sentinel = 1;
		result = 0;
		taylor = 1;
		do
		{
		System.out.println("+,-,*,/ value \nClear \nQuit");
		
		operation = in.next();
		
		 if(operation.equals("sin"))
		 {
			 
			 System.out.println("Sin" + "(" + result + ")" + ": " + Math.sin(result));
		 
			for(n = 0; n <= result; n++)
			{
				factorial = factorial * n;
				
				if ()
				taylor = (Math.pow(-1, n) * Math.pow(result, (2*n) + 1)) / ((2*n) + 1)*(factorial);
				factorial = factorial + 2;
			}
			 
			System.out.println(taylor);
			 
			 
			 System.out.println("+,-,*,/,sin value \nClear \nQuit");
				operation = in.next();
				number = in.nextDouble();
		 
		 
		 
		 }
		
		
		if(operation.equals("Clear"))
		{
			
			result = 0;
			System.out.println(result);
			System.out.println("+,-,*,/,sin value \nClear \nQuit");
			operation = in.next();
			number = in.nextDouble();
		}
		if(operation.equals("Quit"))
		{
			sentinel = 0;
		}
		
		
		
		number = in.nextDouble();
		
			
		if (operation.equals("+"))
			{
				result = result + number;
				System.out.println(result);
			}
		
			
		 if (operation.equals("-"))
			{
				result = result - number;
				System.out.println(result);
			}
			
		 if (operation.equals("*"))
		 {
				result = result * number;
				System.out.println(result);
		 }
			
		 if (operation.equals("/"))
		 {
			 result = result / number;
			 System.out.println(result);
		 }
		
		
		 
		}
		
		while( sentinel == 1 );
		
		
		
		

	}

}
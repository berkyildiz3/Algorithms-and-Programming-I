/**
 * 
 */

/**
 * @author BERKYILDIZ
 *
 */
public class Lab06 {


	public static void main(String[] args) { String s="berl";
	System.out.println(reverse(s)); }
		// TODO Auto-generated method stub

		
		public static double power(double x, int y)
		{
			double power = 1;
			for (int i = 1; i <= y; i++)
			{
				power *= x;
			}
			
			return power;
			
		}
		
		public static int factorial(int n)
		{
			int factorial = 1;
			for(int i=1; i <= n ; i++)
			{
				factorial *= i; 
			}
			
			return factorial;
		}
		
		public static String reverse(String s) {
		    int i, length = s.length();
		    StringBuilder reverse = new StringBuilder(length);

		    for (i = (length - 1); i >= 0; i--){
		        reverse.append(s.charAt(i));
		    }

		    return reverse.toString();
		}

		public static int toDecimal(String base2){
		    double base10=0;
		    for(int i=0; i < base2.length(); i++){
		        if(base2.charAt(i)== '1'){
		         base10 = base10 + power(2,base2.length()-1-i);
		     }

		    }
		    return (int) base10;
		}
		
		
		
		
		
		
		
		
		
		public static String binary(int a) 
		 	{
		       if (a == 0) {
		           return "0";
		       }
		       String binary = "";
		       while (a > 0) {
		           int remainder = a % 2;
		           binary = remainder + binary;
		           a = a / 2;
		       }
		       return binary;
		   }

		









}



	

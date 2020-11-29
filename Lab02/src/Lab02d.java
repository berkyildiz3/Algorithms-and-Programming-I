import java.util.Scanner;
/**
 * 
 */

/**
 * @author BERKYILDIZ
 *
 */
public class Lab02d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Length of first side (a): ");
		double a = in.nextInt();
		
		System.out.print("Length of second side (b): ");
		double b = in.nextInt();
		
		System.out.print("Length of third side (c): ");
		double c = in.nextInt();
		
		double s = (a + b + c) / 2;
		
		double areaOfTriangle = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		double maxNumberOfFlowers = areaOfTriangle * 17;
		
		System.out.printf("The maximum number of flowers that can be planted is %.0f" , maxNumberOfFlowers );
		
		
		
		
	}

}

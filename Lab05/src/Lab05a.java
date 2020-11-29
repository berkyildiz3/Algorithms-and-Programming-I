import java.util.Scanner;

/**This program draws rectangles with a hole inside.
 * @author BERKYILDIZ
 *13.11.2016
 */
public class Lab05a {

	
	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		
		//variables
		int width, height, thickness, i, j;
		String sentinel;
		
		
		sentinel = "Y";
		while(sentinel.equals("Y") || sentinel.equals("y")) //checks for condition
		{
			
			
			
			System.out.print("Enter width: " ); //gets width from the user
			width = in.nextInt();
			
			System.out.print("Enter height: "); //gets height from the user
			height = in.nextInt();
			
			System.out.print("Enter thickness: "); //gets thickness from the user
			thickness = in.nextInt();
				
			
		
		if(width <= 0 || height <= 0 || thickness <= 0) //if user enters invalid values, prints an error message
		{
			System.out.println("All values must be positive!");
		
		}
		else {
		
		//computes the rectangle	
		for(i=1; i <= thickness; i++)
		{
			for (j=1; j <= width ; j++)
			{
				System.out.print("*");
				
			}
		
		System.out.println();
		}
		
		for(i=1; i <= (height - (2 * thickness)); i++)
		{
			for(j=1 ; j <= width; j++)
			{
				if(j <= thickness || j > (width-thickness)    )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
				
				
			}
			System.out.println();
		}
		
		for(i=1; i <= thickness; i++)
		{
			for (j=1; j <= width ; j++)
			{
				System.out.print("*");
				
			}
		
		System.out.println();
		}
		
		//if there is no holes inside the rectangle, warns the user
		if (width <= (2*thickness) || height <= (2*thickness))
		{
			System.out.println("No holes!");	
		}		

		
		
		}			
		
		//asks for user to resume or not.
		System.out.print("Enter Y or y to continue: ");
		sentinel = in.next();
		
		if(sentinel.equals("Y") || sentinel.equals("y"))
		{
			sentinel = "Y";
		}
		else
		{
			sentinel = "w";
			System.out.println("Goodbye..");
		}
		
		
		
		}
		
		
		
	

		
		
		
		
		
	}

}



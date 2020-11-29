import java.util.Scanner;
/*This program creates some patterns with integers by using for loop
 * @author BERKYILDIZ
 *14.11.2016
 */
public class Lab05b {


	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		//variables		
		int i, j, row, column, number;
		String space =" ";
		
		System.out.print("Enter the number of rows: ");//gets the number of rows
		row = in.nextInt();
		
		System.out.print("Enter the number of columns: "); //gets the number of columns
		column = in.nextInt();
		
		System.out.println();
		
		//creates a laid out table with each cell indicating the row and column values.
		for(i=1; i <= row; i++)
		{
			for (j=1; j <= column; j++)
			{
				System.out.print(i + ", " + j + "     ") ;
			}
			System.out.println();
		}
		
		System.out.println();
			
		
		//the product of the row and column numbers
		for(i=1; i <= row; i++)
		{
			for (j=1; j <= column; j++)
			{
				System.out.print(j * i + "      ") ;
			}
			System.out.println();
		}
		
		System.out.println();
		
		//the cell number beginning from 0 and increasing left to right, top to bottom 
		for(  i=1, number=1 ; i<=row ; i++ ){

			  for(  j=1 ; j<=column ; j++, number++ ){

			    System.out.print(number + "      ");

			  }

			  System.out.println("");

			}
		
		System.out.println();
		
		//the row number in the first column only (putting the String "-" into the other cells.)
		for(i=1; i <= row; i++)
		{
			for (j=1; j <= column; j++)
			{
				if  (j==1)
				{
					System.out.print(i + "      ");
				}
				else
			    System.out.print("-" + "     ");
			}
			System.out.println();
		}
		

	}

}

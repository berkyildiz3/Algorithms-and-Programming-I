import java.util.Scanner;
/**
 * 
 */

/**
 * @author BERKYILDIZ
 *
 */
public class Lab02e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = in.next();
		
		System.out.print("Enter the age: ");
		String age = in.next();
		
		System.out.print("Enter the salary: ");
		String salary = in.next();
		
		System.out.print("Enter the comments: ");
		String comments = in.next();
		
		System.out.print("<html>\n\n<head>\n"

						+ "<title>" + name + "'s Home Page</title>\n"
						+ "</head>\n\n"

						+ "<body>\n\n"

						+ "<hr>\n"
						+ "<h1>" + name + "</h1>\n"
						+ "<p>Age: " + age + "</p>\n"
						+ "<p>Salary: " + salary + "</p>\n"
						+ "<p>Comments: " + comments + "</p>\n"
						+ "<br clear=\"all\">\n"
						+ "<hr>\n\n"

						+ "</body>\n\n"

						+ "</html>");
				
				
		
		
	}

}

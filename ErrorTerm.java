package errorterm;

import java.util.Scanner;

/*
 * @author Aastik Gautam
 * @version 1.0    2018-03-06  
 */

public class ErrorTerm {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		
		System.out.println("Enter value 1");
		double value1 = a.nextDouble();
		
		System.out.println("Enter ErrorTerm");
		double errorterm = a.nextDouble();

		
		System.out.println("Enter value 2");
		double value2 = a.nextDouble();
				
		System.out.println("Enter ErrorTerm");
		double ErrorTerm = a.nextDouble();
	
		
		System.out.println("Write the function you want to perform either Addition or Subtraction");
		
		double value_add_result = value1 + value2;
		double errorterm_add_result = errorterm + ErrorTerm;
		
		double value_sub_result = value1 + value2;
		double errorterm_sub_result = errorterm + ErrorTerm;
		
		String input = a.next();
		
		if (input.equals("addition")) {
			System.out.println("Answer " + value_add_result + " ± " + errorterm_add_result);
		}
		else if(input.equals("subtraction")) {
			System.out.println("Answer " + value_sub_result + " ± " + errorterm_sub_result);
		}
		else {
			System.out.println("Enter Addition or Subtraction");
		}
		a.close();
	}

}

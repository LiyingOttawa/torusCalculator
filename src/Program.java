/*
* Assessment: Assignment 01
* Student Name: Liying Guo
* Due Date: June 09, 2023
* Description: Torus Program for Lab Exercise 02
* Professor Name: Amal Ibrahim
*/
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		
		//Declaration of local variables
		float outerRadius;
		float innerRadius;
		double result;
		Torus torus;
		
		//Instantiate Class torus
		torus = new Torus();
		//Output a message
		System.out.println("Enter outer radius: ");
		//Instantiate Class scanner
		Scanner scanner = new Scanner(System.in);
		//Enter a value
		outerRadius = scanner.nextFloat();
		if(outerRadius<=0) {
			scanner.close();
			throw new Exception("The Outer radius should not be 0 or negative value.");
		}

		torus.setOuterRadius(outerRadius);
		
		//Output a message
		System.out.println("Enter inner radius: ");
		//Enter a value
		innerRadius = scanner.nextFloat();
		if(innerRadius<=0) {
			scanner.close();
			throw new Exception("The Inner radius should not be 0 or negative value.");
		}
		
		if(innerRadius>=outerRadius) {
			scanner.close();
			throw new Exception("The Outer radius should greater then Inner radius.");
		}
		
		torus.setInnerRadius(innerRadius);
		
		scanner.close();
		
		//Call function to calculate the volume
		result = torus.getVolume();
		
		//Output the formatted result of volume
		System.out.printf("Volume is:%.2f %n",result);
		System.out.println("Program by Liying Guo");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

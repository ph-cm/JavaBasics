package StaticMembers;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Static Members == class members
		 * (they are different from instance members)
		 * They are associated with the class itself rather than with specific object of the class
		 * 
		 * Characteristics of Static Members
		 * 
		 * they make sense independently of any object
		 * 
		 * you dont need to create an object to access a static member
		 * 
		 * they are call directly using the class name
		 * 	->Math.sqrt(double);
		 * 
		 * Common Applications of Static Members:
		 * 	->Utility Classes (Math.sqrt())
		 * 	
		 * 	->Declaration of constants (public static final double PI = 3.14159)
		 * 
		 * Static Classes:
		 * 	A class that only contain static members can be declared as a static class
		 *  A static class can not be instantiated (when you want to create a utility class that only contains static methods and constants)
		 *  
		 *  Exercise: Make a program that read a value, than show the circle's perimeter, the volume, and the PI value*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("Circumference: %.2f%n", Product.circumference(radius));
		System.out.println("Volume: " + Product.volume(radius));
		System.out.println("PI: " + Product.PI);
		
		sc.close();
	}

}

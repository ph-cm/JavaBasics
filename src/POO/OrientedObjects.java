package POO;

import java.util.Scanner;

public class OrientedObjects {

	public static void main(String[] args) {
		/*Class:
		 * Its an structured type that could have "members"
		 * 		Attributes(data)
		 * 		Methods(functions/operations)
		 * A class can have more things, like:
		 * 		Construtors
		 * 		Overload
		 * 		Encapsulation
				Heritage
				Polymorphism
		 * 
		 * Example:
		 * 	• Entities: Product, Customer, Triangle
			• Services: ProductService, ClienteService, EmailService, StorageService
			• Controllers: ProductController, ClienteController
			• Utilities: Calculator, Compactor
			• Others (views, repositories, managers, etc.)
			
		 * Creating an Class with 3 attributes to represent an triangle
		 * */

	
	Scanner sc = new Scanner(System.in);
	
	//Now that we created the Triangle class, we can use that as an composite variable them, every Triangle type variable represents different triangles
	Triangle x, y;
	x = new Triangle();
	y = new Triangle();
	
	System.out.println("Type the measures of X triangle: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	
	System.out.println("Type the measures of Y triangle: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	/*We can do the math inside of the main program but, its better to make the generic calc. in the Triangle class
	double p = (x.a + x.b + x.c) / 2.0;
	double areaX = Math.sqrt(p * (p - x.a) * (p - x.b)* (p - x.c));
	
	p = (y.a + y.b + y.c) / 2.0;
	double areaY = Math.sqrt(p * ( p - y.a) * (p - y.b) * (p - y.c));
	*/
	
	sc.close();
	}
}

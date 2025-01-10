package POOExample2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Make a program that read the comp. and height of a rectangle
		 * Show the area, perimeter and diagonal
		 * use an toString() method to convert everything  into string*/
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		
		sc.close();
	}

}

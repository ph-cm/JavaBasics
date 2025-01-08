package RepetitiveStructures;

import java.util.Scanner;

public class RepetitiveStructures {
	public static void main(String[] args)
	{
		/*While Structure
		 * 
		 * Is a loop structure that run while an conditions is true( use when you dont know how much times the loop will loop)
		 * 
		 * Sintaxe:
		 * 
		 * while( condition)
		 * {
		 * 		comand1;
		 * 		comand2;
		 * }
		*/
		
		int x = 5;
		int y = 0;
		
		while(x > 2)
		{
			System.out.println(x);
			y = y + x;
			x = x - 1;
		}
		int z = 2;
		int v = 10;
		
		while (z < v)
		{
			z = z * 2;
			v = v + 1;
			System.out.println(z);
			
		}
		
		/*For Structure
		 * 
		 * Its a loop structure that run in an interval of values(use when you know how much times the loop will loop)
		 * 
		 * Sintaxe:
		 * 
		 * for (start ; condition ; increment)
		 * {
		 * comand1;
		 * comand2;
		 * }*/
		
		for (int i=0; i<5; i++)
		{
			System.out.println("Valor de i: " + i);
		}
		for (int i=4; i>0; i--)
		{
			System.out.println("Valor de i: " + i);
		}
		
		/*Do-While Structure
		 * SIntaxe:
		 * 
		 * do
		 * {
		 * 		comand1;
		 * 		comand2;
		 * } while (condition);
		 * 
		 * DO it an Celsius to Fahrenheit program that repeat if the user type "s"*/
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do
		{
			System.out.println("Type the Celsius temp: ");
			double c = sc.nextDouble();
			double f = (9 * c) / 5 + 32;
			System.out.printf("Fahrenheit: %.1f%n", f);
			System.out.println("Would like to try again? (y/n)");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
	}
}

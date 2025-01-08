package SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class sequentialSTructure {

	public static void main(String[] args) {
		/*------------------------------------------------------------------
		 * arithmetic expressions
		 * 
		 * expression -> result
		 * 
		 * 4 + 5 ->     9
		 * + 	 -> 	add
		 * -  	 -> 	sub
		 * * 	 -> 	mult
		 *"/"  	 -> 	div 
		 *% 	 ->	    mod
		 *-----------------------------------------------------------------*/
		
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 5);
		
		/*------------------------------------------------------------------
		 *Variables and primitive types
		 *variable store data
		 *variable are a portion of RAM used during the program executing
		 *
		 *Sintax:
		 *
		 *<type> <name> = <initial value>;
		 *
		 /*
 * Primitive Data Types in Java
 * 
 * ------------------------------------------------------------------------------------------------------------------------
 * | Description         | Type    | Size     | Values                                                    | Default Value |
 * ------------------------------------------------------------------------------------------------------------------------
 * | Integer types       |         |          |                                                           |               |
 * |                     | byte    | 8 bits   | -128 to 127                                               | 0             |
 * |                     | short   | 16 bits  | -32,768 to 32,767                                         | 0             |
 * |                     | int     | 32 bits  | -2,147,483,648 to 2,147,483,647                           | 0             |
 * |                     | long    | 64 bits  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807   | 0L            |
 * -----------------------------------------------------------------------------------------------------------------------|
 * | Floating-point types|         |         |                                                            |               |
 * |                     | float   | 32 bits | ~ ±1.4E-45 to ±3.4028235E38                                | 0.0f          |
 * |                     | double  | 64 bits | ~ ±4.9E-324 to ±1.7976931348623157E308                     | 0.0           |
 * ---------------------------------------------------------------------------------------------------------------------- |
 * | Character type      |         |         |                                                            |               |
 * |                     | char    | 16 bits | '\u0000' to '\uFFFF'                                       | '\u0000'      |
 * -----------------------------------------------------------------------------------------------------------------------|
 * | Boolean type        |         |         |                                                            |               |
 * |                     | boolean | 1 bit   | {false, true}                                              | false         |
 * ------------------------------------------------------------------------------------------------------------------------
 */
		int age = 25;
		double height = 1.74;
		char sex = 'M';
		
		System.out.println("Your age is: " + age);
		System.out.println("Your height is: " + height);
		System.out.println("Your sex is: " + sex);
		
		/*Variable names
		 * Can't start with digit
		 * Can't have a blank space
		 * Can't have accent
		 * Use camelCase
		 * 
		 * 3 basics progamming operation
		 * Data Input -> Data Processing -> Data Output
		 * INPUT = read
		 * Processing = calc
		 * Output = write (System.out.println())
		 * 
		 * Floating variable are writed = System.out.println("%.2f%n", x);
		 * Concatenate elements = el1 + el2 + el3
		 * Concatenate multi types on one comand line = ("txt01 %f txt2 %f txt3", var1, var2) -> %f float point
		*/
		
		System.out.println("Output");
		double var1 = 10.3;
		double var2 = 23.4;
		System.out.printf("Var1 is %.2f and Var2 is %.2f %n", var1, var2);
		
		int age2 = 34;
		String name = "Pedro";
		double salary = 3500.0;
		System.out.printf("My name is %s, i have %d years old and my salary is %.2f%n", name, age2, salary);

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age3 = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is %.2f%n", product1, price1);
		System.out.printf("%s, which price is %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age3, code, gender);
		System.out.printf("Measue with eight decimal places: %f", measure);
		System.out.printf("Rouded (three  decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		/* Importing classes = CTRL + SHIFT + O
		 * Autoendentation = CTRL + SHIFT + F
		 
		  Data processing, Casting
		  attribution comand
		  
		  Sintaxe:
		  <variable> = <expression> "=" == receive
		 */
		
		int x, y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		/*Casting
		 * 
		 * Its the conversion of a data type in other type
		 * */
		
		int w, n;
		double resultado;
		
		w = 5;
		n = 2;
		
		resultado = (double) w / n;
		
		System.out.println(resultado);
		
		/* Input data
		 * 
		 * Scanner: create an object that is a "Scanner" type:
		 * 
		 * Scanner sc = new Scanner(System.in); -> import jaav.util.Scanner;
		 * 										-> do it sc.close() when stop using it
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		 String p;
		 int c;
		 double v;
		 char g;

		 //p = sc.next(); //read text 
		 //c = sc.nextInt(); // read integers
		 //v = sc.nextDouble(); // read double
		 //g = sc.next().charAt(0); // read char
		 
		 String s1, s2, s3;
		 System.out.println("Choose 3 words:");
		 s1 = sc.nextLine();
		 s2 = sc.nextLine();
		 s3 = sc.nextLine();
		 
		 System.out.println("DADOS DIGITADOS: ");
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 sc.close();
		 
		 /*Math Function
 *
 * --------------------------------------------------------------------------
 * | Example              | Meaning                                         |
 * --------------------------------------------------------------------------
 * | A = Math.sqrt(x);    | Variable A receives the square root of x        |
 * | A = Math.pow(x, y);  | Variable A receives the result of x raised to y |
 * | A = Math.abs(x);     | Variable A receives the absolute value of x     |
 * --------------------------------------------------------------------------
*/
		 double v1 = 3.0;
		 double v2 = 4.0;
		 double v3 = -5.0;
		 double A, K, C;
		 
		 A = Math.sqrt(v1);
		 K = Math.sqrt(v2);
		 C = Math.sqrt(v3);
		 System.out.println(A);
		 System.out.println(K);
		 System.out.println(C);
		 
		 A = Math.pow(v1, v2);
		 K = Math.pow(v1, 2.0);
		 C = Math.pow(5.0, 2.0);
		 System.out.println(A);
		 System.out.println(K);
		 System.out.println(C);
		 
		 A = Math.abs(v2);
		 K = Math.abs(v3);
		 System.out.println(A);
		 System.out.println(K);
		 
		 //Baskara
		 double b1, a1, c1, x1, x2, delta;
		 
		 a1 = 2.0;
		 b1 = 9.0;
		 c1 = 3.0;
		 
		 delta = Math.pow(b1, 2.0) - (4 * a1 * c1);
		 
		 x1 = (-b1 + Math.sqrt(delta)) / (2.0 * a1);
		 x2 = (-b1 - Math.sqrt(delta)) / (2.0 * a1);
		 System.out.println(x1);
		 System.out.println(x2);
		 
	}

}

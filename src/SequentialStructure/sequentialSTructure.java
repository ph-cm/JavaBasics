package SequentialStructure;

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
		 * Use camelCase*/

	}

}

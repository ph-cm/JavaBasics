package ConditionalStructure;

import java.util.Scanner;

public class ConditionalStructure {

	public static void main(String[] args) {
		/*Comparative Expression
		 * expression -> result -> true value
		 * 5 > 10 -> False
		 * 
		 * /*
 * -------------------------------
 * | Operator | Meaning          |
 * -------------------------------
 * | >        | greater than     |
 * | <        | less than        |
 * | >=       | greater or equal |
 * | <=       | less or equal    |
 * | ==       | equal            |
 * | !=       | not equal        |
 * -------------------------------
*/
		int x = 5;
		System.out.println(x > 0);
		System.out.println(x == 3);
		System.out.println(10 <= 30);
		System.out.println(x != 2);
		/*
		 * Logic Expression
		 *
 * ------------------------
 * | Operator | Meaning   |
 * ------------------------
 * | &&       | AND (E)   |
 * | ||       | OR (OU)   |
 * | !        | NOT (NÃO) |
 * ------------------------
 */
		System.out.println(x <= 20 && x == 10);
		System.out.println(x > 0 && x != 3);
		System.out.println(x == 10 || x <= 20);
		System.out.println(x > 0 || x != 3);
		System.out.println(!(x == 10));
		System.out.println(!(x >= 2));
		
		/*Conditional Structure
		 * One code block will run only if a condition has been activated
		 * Sintaxe:
		 * if( <condition> )
		 * {
		 * <comand1>
		 * <comand2>
		 * }else if(<condition2>)
		 * {
		 * <comand3>
		 * <comand4>
		 * }else
		 * {
		 * <comand5>
		 * <comand6>
		 * }
		 * 
*PROBLEM:
*A telephone operator charges R$50.00 for a basic plan that
entitles you to 100 minutes of telephone time. Every minute that exceeds the
100 minute allowance costs R$2.00. Make a program to read the
number of minutes that a person consumed, hence showing the value
to be paid. */
		Scanner sc = new Scanner(System.in);
		
		double minutes, account;
		account = 50.0;
		
		System.out.println("How much minutes did you use: ");
		minutes = sc.nextInt();
		
		if(minutes > 100.0)
		{
			account += (minutes - 100) * 2.0;
		}
		
		System.out.printf("Account value: $%.2f%n", account);
		
	
	/*Switch Case Structure
	 * Sintaxe:
	 * 
	 * when we have some variables values that has different results/ paths
	 * 
	 * switch ( expression )
	 * {
	 * case values1:
	 * 		comand1
	 * 		comand2
	 * 		break;
	 * case value2:
	 * 		comand3
	 * 		comand4
	 * 		break;
	 * default:
	 * 		comand5
	 * 		comand6
	 * 		break;
	 * }
	 * Study Case:
	 * days of the week*/
	
	System.out.println("Which day of the week: ");
	int day = sc.nextInt();
	String d;
	
		switch(day)
		{
		case 1:
			d = "Sunday";
			break;
		case 2:
			d = "Monday";
			break;
		case 3:
			d = "Tuesday";
			break;
		case 4:
			d = "Wednesday";
			break;
		case 5:
			d = "Thursday";
			break;
		case 6:
			d = "Friday";
			break;
		case 7:
			d = "Saturday";
			break;
		default:
			d = "Invalid Value";
			break;
		}
	System.out.printf("Today is %s%n", d);
	
	/*Ternary conditional expression
	 * a different if-else sintaxe
	 * 
	 * Sintaxe:
	 * 
	 * ( condition) ? True-Value : False-Value*/
	
	//if 2 > 4, print 50 else print 80
	System.out.println((2 > 4) ? 50 : 80);
	System.out.println((10 != 3) ? "Maria" : "Alex");
	
	/*Scope and startup
	 * Scope is the program area that an variable is valid, there is where it can be referenced
	 * A variable need to be initialized before used
	 */
	double value = sc.nextDouble();
	if (value > 100.0)
	{
		double discount = value * 0.1;
	}
	//discount can't be used outside the if-else loop
	//System.out.println(discount);
	}

	}
}



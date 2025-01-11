package StaticMemberEx;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Make a program that read the dollar price and convert to reais*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.calc(price, quantity));
		
		sc.close();
		
	}

}

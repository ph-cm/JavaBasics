package POOExample;

import java.util.Scanner;

public class Product {
	
	Scanner sc = new Scanner(System.in);
	
	public double price;
	public int quantity;
	
	public double TotalValueInStock(double price, int quantity)
	{
		return price * quantity;
	}
	
	public void AddProduct(int quantity)
	{
		System.out.println("How much products do you want to add: ");
		quantity = sc.nextInt();
		this.quantity += quantity;
	}
	
	public void RemoveProduct(int quantity)
	{
		System.out.println("How much products do you want to remove: ");
		quantity = sc.nextInt();
		this.quantity -= quantity;
	}
}

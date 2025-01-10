package POOExample;

import java.util.Scanner;

public class Consult {

	public static void main(String[] args) {
		/*Make a program that read an stock product data(name, price and quantity)
		 * -Show the product data(name, price, quantity and the total value on stock)
		 * -Add a product on stock
		 * -Sub a product on stock
		 * Create a class called product with Name, Price, Quantity attributes, Totalvaluesinstock(), Addproduct(), RemoveProduct() methods
		 * */
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		Product product = new Product();
		
		System.out.println("Enter a product data");
		System.out.println("Name: ");
		name = sc.nextLine();
		System.out.println("Price:");
		product.price = sc.nextDouble();
		System.out.println("Quantity:");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + name + ", $ " + product.price + ", " + product.quantity + " units " + ", Total: " + product.TotalValueInStock(product.price, product.quantity));
				
		product.AddProduct(product.quantity);
		
		System.out.println("Product data: " + name + ", $ " + product.price + ", " + product.quantity + " units " + ", Total: " + product.TotalValueInStock(product.price, product.quantity));

		product.RemoveProduct(product.quantity);
		
		System.out.println("Product data: " + name + ", $ " + product.price + ", " + product.quantity + " units " + ", Total: " + product.TotalValueInStock(product.price, product.quantity));
		sc.close();
		
	}
}

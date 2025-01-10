package POOExample3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Read the employee data(name, salary and taxes)
		 * Show the employee data
		 * Add the salary based on a percentage (taxes doesnt count)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.salary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.name + ", $" + employee.NetSalary());
		
		System.out.println("Which percentage to increase salary? ");
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + employee.name + ", $" + employee.NetSalary());
		
		sc.close();
	}

}

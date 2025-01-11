package StaticMembers;

public class Product {

	public static final double PI = 3.14159;
	
	public static double circumference(double radius)
	{
		return 2 * radius * PI;
	}
	
	public static double volume(double radius)
	{
		return 4 * PI * radius * radius * radius / 3;
	}
}

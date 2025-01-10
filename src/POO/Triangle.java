package POO;

/* An class is an definition of a type
 * And an object is an instance of a class*/
public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area()
	{
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}

/*So here the explanation of all the stuff on the code:
 * 	package <name> -> package of the class
 *  
 *  Triangle -> Class name
 *  
 *  public -> indicates that this attribute can be used in other files/classes (accesability)
 *  
 *  double a, b, c -> Class attributes
 *  
 *  double(Method) -> Data type that the method will return( If it doesnt return, use "void"
 *  
 *  area -> Method name
 *  
 *  () -> List of parameters of method
 */
package StaticMemberEx;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double calc(double price, double quantity)
	{
		return (price * quantity) + ((price * quantity) * IOF);
	}
	
}

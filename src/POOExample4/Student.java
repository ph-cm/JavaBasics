package POOExample4;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade()
	{
		return grade1 + grade2 + grade3;
	}
	
	public String toString()
	{
		if(finalGrade() > 60)
		{
		return name 
				+ ", congratulations you PASS.";
		}
		else
		{
			return name
					+ ", unfortunetly you FAILED.";
		}
	}
}

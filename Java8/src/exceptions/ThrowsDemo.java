package exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal=new Calculator();
		
		try
		{
			cal.add(23, 34);
			//Critical Method
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("code executed !");
		}
		

	}

}

class Calculator{

	
	public void add(int num1,int num2) throws NegativeNumberException,NoGreaterthanHundred
	{
		
		if(num1 <0 || num2 <0)
		{
			throw new NegativeNumberException();
		}
		else if(num1>100 || num2>100)
		{
			throw new NoGreaterthanHundred();
		}
		else
		{
			System.out.println(num1+num2);
		}
		
	}
	
}
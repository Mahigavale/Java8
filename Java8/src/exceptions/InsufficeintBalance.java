package exceptions;

public class InsufficeintBalance extends Exception {
	
	public InsufficeintBalance()
	{
		super("you have insufficient balance !");
	}

}

class LargerAmountEXception extends Exception
{
	
	public LargerAmountEXception()
	{
		super("limit excedeed  for the day , Please try after 24 Hours !");
	}
}


class NegativeNumberException extends Exception
{
	public NegativeNumberException()
	{
		super("no negative numbers are allowed !");
	}
}

class NoGreaterthantenEXception extends Exception
{
	public NoGreaterthantenEXception()
	{
		super("no greater than 10 allowewd !");
	}
	
}
class NoGreaterthanHundred extends Exception
{
	public NoGreaterthanHundred()
	{
		super("100 पेक्षा जास्त काम करणार नाही");
	}
	
}

package exceptions;

public class Bankexception {

	public static void main(String[] args) {

		
		
		double withdrawal=57000;
		
		Account acc=new Account("John","343434",56789);
		double result=0.0;
		
		
		try
		{
			result=acc.balance-withdrawal;
			if(result <0)
			{
				throw new InsufficeintBalance(); //
			}
			else
			{
				System.out.println("remaining balance :"+result);
			}
		}
		
		catch(InsufficeintBalance e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
	        e.printStackTrace();
			}
		
		finally
		{
			System.out.println("code executed !");
		}
	}

}

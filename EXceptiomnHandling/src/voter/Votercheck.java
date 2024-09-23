package voter;

public class Votercheck {

	public static void main(String[] args) {
		
		Votingday day=new Votingday();
		
		//day.age=21;
		
		day.eligibility(17,false);
		
		

	}

}

class Votingday
{
//	public int age;
//	public boolean criminal_history;
	
	
	public void eligibility(int age ,boolean criminal_history)
	{
		
		try {
			if(age<18)
			{
				throw new Ineligibleforvoteexception();
			}
			else
			{
				System.out.println("you can vote for better tomorrow !");
			}
		}
		catch(Ineligibleforvoteexception e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
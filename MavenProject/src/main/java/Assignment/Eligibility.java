package Assignment;

public class Eligibility {

	public static void main(String[] args) {
		int age = 20;// TODO Auto-generated method stub
		Eligibility obj=new Eligibility();
		boolean isEligible = obj.isEligible(age);
		if(isEligible)
		{
			System.out.println("The candidate is eligible for voting.");
		}
		else
		{
			System.out.println("The candidate is not eligible for voting.");
		}
	}
	public boolean isEligible(int age)
	{
	return age>= 18;	
	}

}

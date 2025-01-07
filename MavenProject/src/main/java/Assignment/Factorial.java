package Assignment;

public class Factorial {

	public static void main(String[] args) {
		int number = 5;
		// TODO Auto-generated method stub
		Factorial obj=new Factorial();
		int result = obj.DisplayFactorial(number);
		System.out.println("The factorial of "+ number + " is: "+result );
	}
public int DisplayFactorial(int number)
{
	int factorial=1;
	for (int i=1;i<= number;i++)
	{
		factorial *= i;
	}
	return factorial;
}
}

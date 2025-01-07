package Assignment;

public class Pallindrome{

	public static void main(String[] args) {
		int number = 121;
		Pallindrome obj = new Pallindrome();
		int reverse = obj.findReverse(number);
		boolean palindrome = obj.isPalindrome(number);
		System.out.println("The reverse of " + number + " is:" + reverse);
		if(palindrome)
		{
			System.out.println(number + " is a palindrome.");
		}
		else
			
		{
			System.out.println(number + " is not a palindrome.");	// TODO Auto-generated method stub
		}

	}
	public boolean isPalindrome(int number)
	{
		return number == findReverse(number);
	}
	public int findReverse(int number)
	{
		int reverse=0;
		while(number !=0)
		{
			int digit = number%10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}
		return reverse;
	}

}

package keywords;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor();
		
	}
public Constructor()
{
	this(6);
	System.out.println("non parameterised");
	
}
public Constructor(int a)
{
	this(4.6f);
	System.out.println(a);
}
public Constructor(float b)
{
	System.out.println(b);
}
}

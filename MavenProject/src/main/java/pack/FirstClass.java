package pack;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods.add();
		Methods ref1=new Methods(2);
		Methods ref2=new Methods(3.4f);
	}
	public static void add()
	{
		int a=3,b=4,sum;
		sum=a+b;
		System.out.println(sum);
	}
	public Methods(float e)
	{
		System.out.println(e);
	}
	public Methods(int e)
	{
		System.out.println(e);
	}

}

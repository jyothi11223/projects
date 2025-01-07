package keywords;

public class Methods {

	public static void main(String[] args) {
		Methods obj=new Methods();
		obj.display();
		// TODO Auto-generated method stub

	}
	public void print()
	{
		this.output(4);
		System.out.println("hello");
	}
	public void display()
	{
		this.print();
		System.out.println("hai");
	}
	public void output(int a)
	{
		
		System.out.println("good");
	}

}

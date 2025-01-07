package keywords;

public class Sample {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Sample obj=new Sample(8);
 obj.display();
	}
	public Sample(int a)
	{
		this.a=a;
	}
	public void display()
	{
		System.out.println(a);
	}

}

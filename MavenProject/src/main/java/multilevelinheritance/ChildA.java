package multilevelinheritance;



public class ChildA extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA obj=new ChildA();
		obj.output();
		obj.display();
	
	}
	public void output()
	{
		System.out.println("method of child class A");
	}
}

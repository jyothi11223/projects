package multilevelinheritance;



public class ChildB extends ChildA{

	public static void main(String[] args) {
		ChildB obj=new ChildB();
		obj.disp();// TODO Auto-generated method stub
        obj.display();
        obj.output();
	}
	public void disp()
	{
		System.out.println("method of child class B");
	}
}

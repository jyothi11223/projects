package Assignment;

public class SetDetails {
 private String name;
private int age;
	public static void main(String[] args) {
		SetDetails obj= new SetDetails();
		obj.person("Alice",30);
		obj.details();
		// TODO Auto-generated method stub

	}
	public SetDetails()
	{
		this.name = "Jyothi";
        this.age = 30;
	}
	public void person(String name,int age)
	{
        this.name = name;
        this.age = age;
	}
	public void details()
	{
		System.out.println("Name:"+ this.name+ " ,Age: "+this.age);
	}

}

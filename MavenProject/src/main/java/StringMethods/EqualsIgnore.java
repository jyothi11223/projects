package StringMethods;

public class EqualsIgnore {

	public static void main(String[] args) {
		String a="hello";
		String b="Hello";
		String c=new String("hello");
		System.out.println(b.equalsIgnoreCase(c));
		System.out.println(a.equals(c));// TODO Auto-generated method stub
        System.out.println(a==c);
	}

}

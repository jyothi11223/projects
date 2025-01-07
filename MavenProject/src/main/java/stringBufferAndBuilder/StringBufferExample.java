package stringBufferAndBuilder;

public class StringBufferExample {

	public static void main(String[] args) {
	StringBuffer refvar= new StringBuffer("Hello");
	refvar.append(" World");
	refvar.insert(6,"Beautiful ");
	refvar.replace(0,5,"Hai");
	refvar.delete(4, 13);
	refvar.reverse();
	System.out.println(refvar);// TODO Auto-generated method stub

	}

}

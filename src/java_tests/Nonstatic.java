package java_tests;

public class Nonstatic {
	
	public void Meth() {
		System.out.println("this is anon static method");
	}
public static void main(String[] args) {
	Nonstatic n =new Nonstatic();
	n.Meth();
}
}

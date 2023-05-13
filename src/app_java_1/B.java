package app_java_1;

public class B implements A {
	
	@Override
	
	public void test1() {
		
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test1();
		
	}
	

}

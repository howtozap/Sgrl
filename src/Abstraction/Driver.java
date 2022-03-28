package Abstraction;

public class Driver {
	public static void main(String[] args) {
		C obj1=new C();
		System.out.println(obj1.i);
		System.out.println(obj1.a);
		
		D obj2=new D();
		System.out.println(obj2.a);
		System.out.println(obj2.i);
		
		
		C obj3=new D();//upcast
		System.out.println(obj3.a);
		
	 
		
	}

}

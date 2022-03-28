package javaPrograme;

public class Driver {

	public static void main(String[] args) {
		
				Emp obj1=new Dev();//upcast
				System.out.println(obj1.i);

		Dev obj2=(Dev)obj1;//downcast
		Test obj3=(Test)obj1;
		System.out.println(obj2.j);
System.out.println(obj3.k);			
}

		}
	



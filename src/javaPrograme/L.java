package javaPrograme;

public class L {
	static int a=100;
	static {
		System.out.println("from sib of L");
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("from main of p");
		System.out.println(a);
		System.out.println(I.i);
		System.out.println(I.j);

	

	}

}

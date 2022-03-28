package Abstraction;

public class SwapVariable {
	public static void main(String[] args) {
		int a=4;
		int b=6;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping variable a is"+a+"b is"+b);
		
	}

}

package javaPrograme;

public class I {
	
		static int i=10;
		static int j=20;
		
		static {
			System.out.println("from main of k");
			i=30;
		}
		public static void main(String[] args) {
			System.out.println("from main() of k");
			System.out.println(i);
			System.out.println(j);
		}

}
 
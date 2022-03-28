package javaPrograme;

public class Prime1 {
	public static void main(String[] args) {
		int num=6;
		int temp=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				if(temp==0)
				{
					System.out.println(num+"is prime no");
				}
			}
			else {
				System.out.println(num+"is not prime");
			}
		}
		
	}

}

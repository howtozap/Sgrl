package Abstraction;
//Bubbele short

public class AsccendingOrder {
	public static void main(String[] args) {
		int a[]= {15,16,12,10,11};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		

}
}

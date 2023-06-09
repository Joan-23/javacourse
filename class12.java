package project1;

public class class12 {

	public static void main(String[] args) {
		// Bubble Sort 
		// Get inputs from Random Values
		
		int[] a=new int[11];
		//Input(elements)
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}

package project1;

public class class15 {
	
	// Methods in Java
	
	static void sortArray(int[] a)
	{
		// Sorting Array using Bubble Sort
		
		
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

	public static void main(String[] args) {
		
		int[] a= {10,9,8,7,6,5,4,3,2,1};
		
		//Function call

		sortArray(a);
		
		

		
	}

}

package project1;

public class class13 {

	public static void main(String[] args) {
		// Multi-dimensional Arrays
		
		int[][] arr= {{3,5,6,2,7},{9,3,2,1,3}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			
		}
		System.out.println("Sum of the Elemnts:"+sum);

	}

}

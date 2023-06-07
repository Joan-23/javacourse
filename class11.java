package project1;

import java.util.Scanner;

public class class11 {

	public static void main(String[] args) {
		// Arrays
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Size:\n");
		int size=r.nextInt();
		int[] a=new int[size];
		int sum=0;
		System.out.println("\nEnter the elements:");
		for(int i=0; i<size; i++)
		{
			a[i] = r.nextInt();
	         sum = sum + a[i];
		}
		System.out.println("\nSum of the elements is:"+sum);
	}
}
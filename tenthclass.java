package project1;

import java.util.Scanner;

public class tenthclass {

	public static void main(String[] args) {
		// Simple calculator using loop
		while(true)
		{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first Number:\n");
		int a=input.nextInt();
		System.out.println("Enter the second Number:\n");
		int b=input.nextInt();
		System.out.println("Enter ypur Choice 1-Add,2-Sub,3-Multiply,4-Divide,5-Modulo,6-Exit.Enter your Choice below:\n");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4: 
			double res=(double)(a/b);
			System.out.println(res);
			break;
		case 5:
			System.out.println(a%b);
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("Enter number 1 to 5");
				
		}
		}
	}}
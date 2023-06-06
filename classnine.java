package project1;

import java.util.Scanner;

public class classnine {

	public static void main(String[] args) {
	//simple calculator
		Scanner r = new Scanner(System.in);
		int a=r.nextInt();
		int b=r.nextInt();
		System.out.println("Enter ypur Choice 1-Add,2-Sub,3-Multiply,4-Divide,5-Modulo");
		int ch=r.nextInt();
		switch(ch)
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
		default:
			System.out.println("Enter number 1 to 5");
				
		}
	}

}

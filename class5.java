package project1;

public class class5 {

	public static void main(String[] args) {
		double price1=5.1;
		double price2=1.2;
		double price3=2.2;
		double price4=3.2;
		double price5=4.2;
		
		double high=price1;
		double low=price1;

		if(high<price1)
		{
			high=price1;
		}
		if(high<price2)
		{
			high=price2;
		}
		if(high<price3)
		{
			high=price3;
		}
		if(high<price4)
		{
			high=price4;
		}
		if(high<price5)
		{
			high=price5;
		}
		if(low>price1)
		{
			low=price1;
		}
		if(low>price2)
		{
			low=price2;
		}
		if(low>price3)
		{
			low=price3;
		}
		if(low>price4)
		{
			low=price4;
		}
		if(low>price5)
		{
			low=price5;
		}
		System.out.println(high);
		System.out.println(low);
		
		double secondhigh=0;
		double secondlow=high;
		
		if(price1>secondhigh && price1!=high)
		{
			secondhigh=price1;
		}
		if(price2>secondhigh && price2!=high)
		{
			secondhigh=price2;
		}
		if(price3>secondhigh && price3!=high)
		{
			secondhigh=price3;
		}
		if(price4>secondhigh && price4!=high)
		{
			secondhigh=price4;
		}
		if(price5>secondhigh && price5!=high)
		{
			secondhigh=price5;
		}
		if(price1<secondlow && price1!=low)
		{
			secondlow=price1;
		}
		if(price2<secondlow && price2!=low)
		{
			secondlow=price2;
		}
		if(price3<secondlow && price3!=low)
		{
			secondlow=price3;
		}
		if(price4<secondlow && price4!=low)
		{
			secondlow=price4;
		}
		if(price5<secondlow && price5!=low)
		{
			secondlow=price5;
		}
		System.out.println(secondhigh);
		System.out.println(secondlow);
		
	}

}

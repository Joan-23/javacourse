package project1;

public class class16 {

	public static void main(String[] args) {
		
		//Object oriented programming concept
		
		car c=new car();
		c.carnumber=3244521;
		c.Name="RollsRoyce";
		c.No_of_seats=5;
		
		System.out.println("Car Name : " +c.Name);
		System.out.println("Car Number : " +c.carnumber);
		System.out.println("Seats : " +c.No_of_seats);
		
		

	}

}
class car
{
	int carnumber;
	String Name;
	int No_of_seats;
}

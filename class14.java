package project1;

public class class14 {

	public static void main(String[] args) {
		// Random String Using Java
		
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		
		String finalstring="";
		
		
		/*Returns one character
		 * 
		 * String finalstring="" + candidateChars.charAt((int)(Math.random()* candidateChars.length()));
		;
		 */
		
		
		//Return 10 characters
		
		for(int i=0;i<10;i++)
		{
			finalstring+=candidateChars.charAt((int)(Math.random()* candidateChars.length()));
					
		}
		System.out.println(finalstring);

	}

}

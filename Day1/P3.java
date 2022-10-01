import java.util.Scanner;

public class P3{
	private static Scanner sc;
	public static void main(String[] args) 
	{
	 
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Five Subjects Marks : ");
		int m1 = sc.nextInt();	
		int m2 = sc.nextInt();	
		int m3 = sc.nextInt();	
		int m4 = sc.nextInt();	
		int m5 = sc.nextInt();	
		
		
		 float T = m1+m2+m3+m4+m5;
		
		 
	
	     float P = (T / 500) *100;
	    
	    System.out.println(" Total Marks =  " + T);

	    System.out.println(" Percentage Marks =  " + P +"%");
	}
}
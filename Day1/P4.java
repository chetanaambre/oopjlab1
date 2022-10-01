import java.util.Scanner;

class P4{
	private static Scanner sc;
	public static void main(String[] args) 
	{
	 
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principle Amount : ");
		float p = sc.nextInt();	
		System.out.println("Enter the Rate of Interest: ");
		float r= sc.nextFloat();
		System.out.println("Enter the time in terms of year : ");
		float t = sc.nextFloat();	
	
		
		
		 float i =(p*r*t)/100 ;
		
		 
	
	    
	    
	    System.out.println(" Simple Interest =  " + i);

	   
	}
}
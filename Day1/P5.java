import java.util.Scanner;

class P5{
	private static Scanner sc;
	public static void main(String[] args) 
	{
	 
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of dayas : ");
		int n = sc.nextInt();	
		
		int y =n/365;
		int temp=n%365;
        int m=temp/30;
		int d=temp%30;
		

	    System.out.println(y+" Years "+m+" Months "+d+" Days ");
	}
}
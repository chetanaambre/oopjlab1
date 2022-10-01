import  java.util.Scanner;
	class P7{
		public static void main (String args[]){
		System.out.println("Enter numbers for swapping:");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("BEFORE SWAPPING");
		System.out.println("x="+x);
		System.out.println("y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("AFTER SWAPPING");
		System.out.println("x="+x);
		System.out.println("y="+y);
		}
		}

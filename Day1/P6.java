import java.util.Scanner;
class P6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		float f=sc.nextFloat();
		float c=5*(f-32)/9;
		System.out.println(f+"F = "+c+"C");
		
		
	}
}
import java.util.Scanner;
class P2{
public static void main(String args[])
{
double pi =3.14;
System.out.println("Enter The Radius");
Scanner sc = new Scanner(System.in);
int r=sc.nextInt();
double a= pi*r*r;
double c=2*pi*r;
System.out.println("AREA="+a);
System.out.println("CIRCUMFERENCE"+c);

} 
}
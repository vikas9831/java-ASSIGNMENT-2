import java.util.Scanner;
class abc13
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int year;
System.out.println("enter a year");
year=ob.nextInt();
if(year%4==0 && year%100 !=0 || year%400==0)
	System.out.println("Leap year");
else 
	System.out.println("Not a leap year");
}
}
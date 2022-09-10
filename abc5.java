import java.util.Scanner;
class abc5
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int year;
double sal,bon;
System.out.println("enter service year");
year=ob.nextInt();
System.out.println("enter salary");
sal=ob.nextDouble();
if(year>5)
{
	bon=sal*(0.05);
	System.out.println("net bonus amount:"+bon);
}
else
	System.out.println("No bonus provided");
}
}
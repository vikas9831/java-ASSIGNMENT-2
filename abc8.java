import java.util.Scanner;
class abc8
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int a;
System.out.println("enter a number");
a=ob.nextInt();
if(a<0)
{	a=a*(-1);
	System.out.println(a);
}
else 
	System.out.println(a);
}
}
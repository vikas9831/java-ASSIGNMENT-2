import java.util.Scanner;
class abc7
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int a1,a2,a3;
System.out.println("enter age of first person");
a1=ob.nextInt();
System.out.println("enter age of second person");
a2=ob.nextInt();
System.out.println("enter age of third person");
a3=ob.nextInt();
if(a1>a2 && a1>a3)
	System.out.println("a1 is oldest");
else if(a2>a1 && a2>a3)
	System.out.println("a2 is oldest");
else if(a3>a1 && a3>a2)
	System.out.println("a3 is oldest");
if(a1<a2 && a1<a3)
	System.out.println("a1 is youngest");
else if(a2<a1 && a2<a3)
	System.out.println("a2 is youngest");
else if(a3<a1 && a3<a2)
	System.out.println("a3 is youngest");
else
	System.out.println("all have same age");
}
}
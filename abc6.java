import java.util.Scanner;
class abc6
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
int m;
System.out.println("enter marks");
m=ob.nextInt();
if(m>80)
	System.out.println("A");
else if(m>60 && m<=80)
	System.out.println("B");
else if(m>50 && m<=60)
	System.out.println("C");
else if(m>45 && m<=50)
	System.out.println("D");
else if(m>25 && m<=45)
	System.out.println("E");
else 
	System.out.println("F");
}
}
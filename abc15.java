import java.util.Scanner;
class abc15
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int a,r,rev=0;
System.out.println("enter a number");
a=ob.nextInt();
while(a>0)
{
r=a%10;
a=a/10;
rev=rev*10+r;
}
System.out.println(rev);
}
}
import java.util.Scanner;
class abc2
{
public static void main(String []args)
{
int a,b;
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
b=ob.nextInt();
int c=(a>b)?a:b;
System.out.println("greater number is "+c);
}}
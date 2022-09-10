import java.util.Scanner;
class abc12
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("enter a character");
ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z')
	System.out.println("uppercase alphabet");
else if(ch>='a' && ch<='z')
	System.out.println("lowercase alphabet");
else
	System.out.println("you have not entered an alphabet");
}
}
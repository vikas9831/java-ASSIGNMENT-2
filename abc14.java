import java.util.Scanner;
class abc14
{
public static void main(String [] args)
{
Scanner ob=new Scanner(System.in);
int age;
char sex,ms;
System.out.println("Enter age ");
age=ob.nextInt();
System.out.println("enter gender M for male and F for female");
sex=ob.next().charAt(0);
System.out.println("enter martial status Y for yes and N for no");
ms=ob.next().charAt(0);
if(sex=='F')
	System.out.println("Work only in urban areas");
else if(sex=='M' && age>20 && age<=40)
	System.out.println("He may work anywhere");
else if(sex=='M' && age>40 && age<=60)
	System.out.println("He will work in urban areas only");
else
	System.out.println("ERROR");
}
}
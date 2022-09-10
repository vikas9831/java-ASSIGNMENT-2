import java.util.Scanner;
class abc9
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
Double ch,ca;
Double cap;
System.out.println("enter classes held");
ch=sc.nextDouble();
System.out.println("enter classes attended");
ca=sc.nextDouble();
cap=(ca/ch)*100;
System.out.println("class attended percentage:"+cap);
if(cap<75)
	System.out.println("Student is not allowed to sit in exams");
else
	System.out.println("Student is allowed to sit in exams");
}
}
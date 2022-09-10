import java.util.Scanner;
class abc10
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
char c;
Double ch,ca;
Double cap;
System.out.println("enter classes held");
ch=sc.nextDouble();
System.out.println("enter classes attended");
ca=sc.nextDouble();
System.out.println("enter Y or N for medical case");
c=sc.next().charAt(0);
cap=(ca/ch)*100;
System.out.println("class attended percentage:"+cap);
if(cap<75 && c=='N')
	System.out.println("Student is not allowed to sit in exams");
else
	System.out.println("Student is allowed to sit in exams");
}
}
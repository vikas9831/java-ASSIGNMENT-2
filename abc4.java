import java.util.Scanner;
class abc4
{
public static void main(String []args)
{
 Scanner sc=new Scanner(System.in);
int cost=sc.nextInt();
int new_cost=cost-cost*(0.01);
if(cost>1000)
{
 
System.out.println("new cost="+new_cost);
}
else 
System.out.println("total cost="+cost);
}}


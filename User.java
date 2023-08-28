import java.util.Scanner;
class User
{
public static void main(String args[])
{
int a,b,ch;
System.out.println("Enter user choice..!\n")
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
ch=sc.nextInt();
switch(ch)
{
case1 :System.out.println("Sum" + (a+b));
break;
case2 :System.out.println("sub" + (a-b));
break;
case3 :System.out.println("add" + (a*b));
break;
 default:System.out.println("Invalid choice...!");
 }
 
 System.out.println("out of switch");
 }
 }
 
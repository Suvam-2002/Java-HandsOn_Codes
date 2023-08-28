import java.util.Scanner;
class  Switchhu
{
public static void main(String args[])
{
int a,b,ch;
System.out.println("Enter user choice..!\n");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
ch=sc.nextInt();
switch (ch)
{
 case 1:System.out.println("Sum" + (a+b));
 break;
 case 2: System.out.println("sub" + (a-b));
 break;
 default:System.out.println("Invalid choice...!");
 }
 System.out.println("out sof switch...!");
 }
 }
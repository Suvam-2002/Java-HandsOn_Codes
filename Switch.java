class Switch
{
public static void main(String [] args)
{
int a=10,b=80,ch;
System.out.println("Enter your choive");
Scanner sc= new Scanner(System.in);
ch=sc.nextInt();
switch(ch)
{
case1: System.out.println("sum" + (a+b));
break;
case2: System.out.println("sub" + (a-b));
break;

case3: System.out.println("mul" + (a*b));
break;

case4: System.out.println("Div" + (a/b));
break;

default: System.out.println("invalid choice...!");
}
 System.out.println("out of switch...!");
 
 }
 
}
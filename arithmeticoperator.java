import java.util.Scanner;
class arithmeticoperator
{
public static void main(String []args)
{
int a,b;
System.out.println("Enter the of a values");
System.out.println("Enter the of b values");
Scanner obj=new Scanner(System.in);
a =obj.nextInt();
b=obj.nextInt();
System.out.println("addition is"+ (a+b));
System.out.println("Substraction is"+ (a-b));
System.out.println("Multiplication  is"+ (a*b));
System.out.println("Division is"+ (a/b));
}
}

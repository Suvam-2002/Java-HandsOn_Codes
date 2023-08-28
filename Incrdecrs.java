import java.util.Scanner;
class Incrdecrs //user input
{
public static void main(String []args)
{
int a;
System.out.println("Enter the value");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
System.out.println("prepost increment");
System.out.println(a);
System.out.println(a++);

System.out.println(++a);
}
}

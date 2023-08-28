import java.util.Scanner;
class Oddevev
{
public static void main(String args[])
{
int n;
System.out.println("Enter a nos");
Scanner sc =new Scanner(System.in);
n=sc.nextInt();

if(n%2==0)
{
for (int i=0;i<=n;i=i+2)
{
System.out.println("even");
}
}
else
{
System.out.println("odd");
}
}
}

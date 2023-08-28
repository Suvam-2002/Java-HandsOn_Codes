import java.util.Scanner;
class Sumn
{
public static void main(String args[])
{
int n,sum=0;
System.out.println("Enter the nos");
Scanner sc =new Scanner (System.in);
n=sc.nextInt();

for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Addition" +sum);
}
}

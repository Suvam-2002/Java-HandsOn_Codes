import java.util.Scanner;
class Oddeven
{
public static void main(String args[])
{
int n,i,even=0,odd=0;
System.out.println("Enter the nos");
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
if(n%2==0)
{
for (int i=0;i<=n;i++)
{
even=even+i;
}
System.out.println( even);//even
}
}
}
  else
{
	for (int i=1;i<=n;i++)
{
odd=odd+i;
}
System.out.println(odd);//even

}




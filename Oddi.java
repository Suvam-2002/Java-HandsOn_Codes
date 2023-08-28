import java.util.Scanner;
class Oddi
{
public static void main(String args[])
{
int  n;
System.out.println("Enter an element");

Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=0;i<=n;i=i+2)
{
System.out.println("even" +i);
}

}
}


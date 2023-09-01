import java.util.Scanner;
class Digits
{
    public static void main(String args[])
    {
        int n,count=0;
        System.out.println("enter the nos");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
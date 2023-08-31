import java.util.Scanner;
class Count
{
    public static void main(String[]args)
    {
        int n,count=0;
        System.out.println("Enter the no");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();


        while (n>0)
        {
            n=n/10;
            count++;

        }
        System.out.println(count);
    } 
}
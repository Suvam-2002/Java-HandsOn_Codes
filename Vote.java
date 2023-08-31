import java.util.Scanner;
class Vote
{
    public static void main(String []args)
    {
        int a;
        System.out.print("Enter the value");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        
        if (a>18)
        {
            System.out.print("Eligible for voting"); 
        }
        else
        System.out.print("Not Eligible for voting");
       }
}
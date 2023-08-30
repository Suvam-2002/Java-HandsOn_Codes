import java.util.Scanner;
class Power
{
    public static void main(String args[])
    {
        int no,Power,result=1;
        System.out.println("Enter the nos");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        System.out.println("power");
        Power=sc.nextInt();

        for(int i=1;i<=Power;i++)
        {
            result=no*result;
        }
        System.out.println(result);

    }
}
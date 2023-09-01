import java .util.Scanner;
class Multables
{
    public static void main(String []args)
    {
        int multiplicand,multiplier;
        System.out.println("Enter the nos");
        Scanner sc = new Scanner(System.in);
        multiplicand=sc.nextInt();
        System.out.println("Enter the nos");
        multiplier=sc.nextInt(); 

        for (int i=1;i<=multiplier;i++)
        {
             System.out.println(multiplicand+"*"+i+"="+multiplicand*i);

        }
       
       }
}

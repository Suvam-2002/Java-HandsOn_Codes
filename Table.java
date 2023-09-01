import java.util.Scanner;
class Table
{
    public static void main(String []args)
    {
        int multiplicand,multiplier;
        System.out.println("Enter the multiplicand");
        Scanner sc = new Scanner(System.in);
        multiplicand=sc.nextInt();
        System.out.println("Enter the multiplier");
        multiplier=sc.nextInt();

        for(int i=0;i<=multiplier;i++)
        {
             System.out.println(multiplicand+"*"+i+"="+multiplicand*i);
        }
       
    }
}
import java .util .Scanner;
class Multiplication
{
    public static void main(String []args)
    {
        int multiplicand,multiplier,result=0;

        System.out .println("Enter the nos");
        Scanner sc =new Scanner(System.in);
       
        multiplicand=sc.nextInt();
         System.out.println("Enter the power");
        multiplier=sc.nextInt();

        for (int i=1;i<=multiplier;i++)
        {
          System.out .println( multiplicand+"*"+i+"="+ multiplicand*i);
        }
      
        }

}


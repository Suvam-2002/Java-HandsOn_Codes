import java .util .Scanner;
class Multiplication
{
    public static void main(String []args)
    {
        int no,multiplicant,result=0;

        System.out .println("Enter the nos");
        Scanner sc =new Scanner(System.in);
       
        no=sc.nextInt();
         System.out.println("Enter the power");
        multiplicant=sc.nextInt();

        for (int i=1;i<=multiplicant;i++)
        {
          System.out .println(no+"*"+i+"="+no*i);
        }
      
        }

}


import java .util.Scanner;
class Greater3
{
    public static void main(String args[])
    {
        int a,b,c;
        System.out.println("Enter three nos");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt(); 
        c=sc.nextInt();


        if(a>b)
        {
            if(a>c)
             System.out.print ("a is greater");
             else
              System.out.print ("c is greater");
        }
        else
        {
        if(b>c)
        System.out.print ("b is greater");
        else
        System.out.println(c);
        }
        
    }
}
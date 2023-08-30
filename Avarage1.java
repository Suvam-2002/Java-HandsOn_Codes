import java.util.Scanner;
class Avarage1
{
    public static void main(String[]args)
    {
        int a,b,c,d,e;
        System.out.println("Enter the five nos");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println(sum);

        Double Avg =sum/5.0;
        System.out.println(Avg);
        
    }
}
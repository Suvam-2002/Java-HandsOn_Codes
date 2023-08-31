import java.util.Scanner;
class Factorial
{
    public static void main(String []args)
    {
    int n,Fact=1;
    System.out.println("Enter the nos");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();

    for(int i=1;i<=n;i++)
    {
        Fact=Fact*i;
    }
    System.out.println(Fact);

}
}
    
    
    
    
    
    
    
    
    
    
   

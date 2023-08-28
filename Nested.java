import java.util.Scanner;
class Nested
{
public static void main(String []args)
{
int A,B,C;
System.out.println("enter three no");
Scanner sc =new Scanner(System.in);
 A=sc.nextInt();
 B=sc.nextInt();
 C=sc.nextInt();
 if(A>B)
 {
     if(A>C)
    {
 
     System.out.println("A is greater");
    }
   
   else
   {

   System.out.println("C is greater");

   }
 }  
   else
  {
   if(B>C)
  {

   System.out.println("B is greater");
  }  
else
{

System.out.println("C is greater");
}
}
 }
}


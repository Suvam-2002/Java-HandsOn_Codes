import java.util.Scanner;
class Atozprgm
{
    public static void main(String args[])
    {
    Char ch;
    System.out.println("Enter the character");

    Scanner sc= new Scanner(System.in);
    ch=sc.next().charAt(0);

    for(char i=A;i<=Z;i++)
    {
        System.out.println(i);
        
    }

}
}
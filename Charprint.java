import java.util.Scanner ;
class Charprint
{
public static void main(String args[])
{
char ch;
System.out.println("Enter a character");
Scanner sc =new Scanner(System.in);
ch=sc.next().charAt(2);
System.out.println(ch);
}
}

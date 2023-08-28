import java.util.Scanner;
class Vowelcons
{
public static void main(String args[])
{
char ch;
System.out.println("Enter the character");
Scanner sc= new Scanner(System.in);
ch=sc.next().charAt(0);


if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}


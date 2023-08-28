import java .util. Scanner;
class Vowels
{
public static void main(String []args)
{
char ch;
System.out.println("Enter the character");
Scanner sc =new Scanner(System.in);
ch=sc.next().charAt(0);

if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonat");
}
}
}

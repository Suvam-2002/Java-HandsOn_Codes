import java .util.Scanner;
class Character
{
	public static void main(String args[])
	{
	char ch;
	System.out.println("Enter a ch");
	
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(2);
	
	System.out.println(ch);
}
}


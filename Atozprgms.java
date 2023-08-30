import java.util.Scanner;
class Atozprgms
{
    public static void main(String args[])
    {
        char ch;
        System.out.println("enter the charactre");
        Scanner sc = new Scanner(System.in);
        ch= sc.next().charAt(0);

        for(char i='A';i<='Z';i++)
        {
            System.out.println(i);

        }

    }
}
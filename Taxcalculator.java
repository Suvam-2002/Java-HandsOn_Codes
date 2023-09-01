import java.util.Scanner;
class Taxcalculator
{
    public static void main(String [] args)
    {
        int salary;double tax;
        System.out.println("Enter the salary");
        Scanner sc = new Scanner(System.in);
        salary=sc.nextInt();

        if(salary<=10000)
        {
            System.out.println("no tax");

        }
        else if(salary>= 15000 && salary<= 100000)
        {
            tax= salary*0.1;
            System.out.println( tax);
        }
        else if(salary>= 100000)
        {
            tax= salary*0.2;
            System.out.println(salary + " " + tax);
        }
    }
}
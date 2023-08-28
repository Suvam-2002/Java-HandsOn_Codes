import java.util.Scanner;
class Elseif
{
public static void main(String []args)
{
int marks;
System.out.println("enter your marks");
 Scanner sc=new Scanner(System.in);
 marks=sc.nextInt();
 if(marks>80)
 {
 System.out.println("topper");
 }
 else if(marks<80 && marks>=60)
 {
 System.out.println("First class");
 }
 else if (marks<60 && marks>=50)
 {
 System.out.println("Second class");
 }
 }
 }
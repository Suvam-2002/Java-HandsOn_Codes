class Variableprac
{
int a=12;//instance variable
static int c=33;// static variable

public static void main(String []args)
{
int R=123;//global variable
Variableprac ref=new Variableprac();
System.out.println(R);
System.out.println(c);
System.out.println(ref.a);
}
}

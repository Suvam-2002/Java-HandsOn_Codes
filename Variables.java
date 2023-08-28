class Variables
{     
     
      int c=88;
	  static int b=65;
       public static void main(String args[])
       {
        int a=10;
		Variables ref=new Variables();
        System.out.println(a);
		System.out.println(b);
		System.out.println(ref.c);
	}
}
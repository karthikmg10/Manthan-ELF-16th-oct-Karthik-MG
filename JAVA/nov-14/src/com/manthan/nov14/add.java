class add
{
	public static void main(String ar[])
	{
		/*int a=6;
		int b=4;
		int x=a<b?a:b;
		System.out.println("largest is :" + x);*/

		/*int a=6;
		int b=4;
		int x=a>b?a:b;
		System.out.println("smallest is :" + x);*/
		
		
		int a=6;
		int b=4;
		int c=10;
		int x=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("largest is :" + x);
	}
}
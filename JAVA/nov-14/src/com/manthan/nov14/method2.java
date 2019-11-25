class add
{
	static int fact(int x)
	{
		if(x==0)
		{
			return 1;
		}
		else
		return x*fact(x-1);	
	}
	public static void main(String ar[])
	{
	 	int res= fact(8);
		System.out.println("RESULT IS "+res);			
	}
}
class FloydTriangle
{
	public static void main(String args[])
	{
		int input=Integer.parseInt(args[0]);
		int count=0;
	    for(int i=1;i<=input;i++)
	    {
		for(int j=1;j<=i;j++)
		{ 
			System.out.print("* ");
			count++;
		}
		System.out.println(" ");
	}
	}
}
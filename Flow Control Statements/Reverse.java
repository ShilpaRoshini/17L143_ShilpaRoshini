class Reverse
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
		int rem;
		int rev=0;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
	}
		System.out.println(rev);
	}
}
class Palindrome
{
	public static void main(String args[])
	{
		int no=Integer.parseInt(args[0]);
                int temp=no;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
	}
		if(no==rev)
		{
			System.out.println(no+" is a palindrome number");
		}
		else
		{
			System.out.println(no+" is not a palindrome number");
		}
	}
}
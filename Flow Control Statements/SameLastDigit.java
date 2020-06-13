
public class SameLastDigit
{
	public static void main(String args[])
	{
		int input1=Integer.parseInt(args[0]);
		int input2=Integer.parseInt(args[1]);
		if(input1%10==input2%10)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		}
}

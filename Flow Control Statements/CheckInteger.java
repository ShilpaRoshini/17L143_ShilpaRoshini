import java.util.Scanner;

public class CheckInteger 
{
	public static void main(String args[])
	{
		int input1=Integer.parseInt(args[0]);
                  if(input1>0)
		{
			System.out.println("Positive");
		}
		else if(input1<0)
		{
			System.out.println("Negative");
			
		}
		else
		{
			System.out.println("Zero");
		}
		
		
		}
}

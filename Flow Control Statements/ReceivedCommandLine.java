
public class ReceivedCommandLine 
{
	public static void main(String args[])
	{    
             int len=args.length;
              if(len==0)
		{
			System.out.println("No value");
		}
		else
               {
                   System.out.print(args[0]);
                    for(int i=1;i<len;i++)
                    {
                     System.out.print(","+args[i]);
                    }
                   
               }
        }
}

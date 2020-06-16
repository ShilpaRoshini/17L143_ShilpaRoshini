class SecondMaxMin
{
	public static void main(String args[])
	{
		int[] arr=new int[]{1,2,3,4,5};
		int max=arr[0];
		int min=arr[0];
		int temp;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			  max=arr[i];
			}
            if(min>arr[i])
			{
			  min=arr[i];
			}
           
			
		}
		System.out.println("largest 1st no = "+max);
		System.out.println("smallest 1st no = "+min);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
		 if(arr[i]<arr[j])
         {
         	temp=arr[i];
         	arr[i]=arr[j];
         	arr[j]=temp;
         }
			}
	
		}
		System.out.println("largest 2nd no = "+arr[1]);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
		 if(arr[i]>arr[j])
         {
         	temp=arr[i];
         	arr[i]=arr[j];
         	arr[j]=temp;
         }
			}
			
		}
		System.out.println("smallest 2nd no = "+arr[1]);
		
	}	
}

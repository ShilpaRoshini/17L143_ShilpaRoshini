class MaxMin
{
	public static void main(String args[])
	{
		int[] arr=new int[]{1,2,3,4,5};
		int max=arr[0];
		int min=arr[0];
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
		System.out.println(max);
		System.out.println(min);
	}
		
}


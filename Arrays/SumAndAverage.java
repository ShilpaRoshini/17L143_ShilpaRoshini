class SumAndAverage
{
	public static void main(String args[])
	{
		int[] arr=new int[]{1,2,3,4,5};
		int sum=0;
		int len=arr.length;
		int average=1;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		   average=sum/len;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+ average);
	}
}
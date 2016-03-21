public class CopyingArrays
{
	public static void main( String[] args)
	{
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = 1 + (int)(Math.random()*100);
			System.out.print(arr[i] + " ");
		}

	}
}
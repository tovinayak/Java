import java.util.Scanner;
public class FindDuplicate {
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if((j+1<arr.length)&&(arr[j]>arr[j+1]))
					swap(arr,j,j+1);
			}
		}
	}
	public static int duplicate(int arr[])
	{
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1])
				return arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=s.nextInt();
			System.out.println(duplicate(arr));
		}
	}
}
